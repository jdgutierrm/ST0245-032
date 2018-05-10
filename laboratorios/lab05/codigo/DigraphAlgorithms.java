package Lab5;
import java.util.ArrayList;
import java.util.Arrays;
public class DigraphAlgorithms
{
    private static int minVertex (int [] dist, boolean [] v) {
        int x = Integer.MAX_VALUE;
        int y = -1;   // graph not connected, or no unvisited vertices
        for (int i=0; i<dist.length; i++) {
            if (!v[i] && dist[i]<x) {y=i; x=dist[i];}
        }
        return y;
    }
  
    
    static int [] dijsktra(Digraph dg, int source){
        final int [] dist = new int [dg.size()];  // shortest known distance from "s"
        final int [] pred = new int [dg.size()];  // preceeding node in path
        final boolean [] visited = new boolean [dg.size()]; // all false initially
   
        for (int i=0; i<dist.length; i++) {
            dist[i] = Integer.MAX_VALUE; //Infinity
        }
        dist[source] = 0;
  
        for (int i=0; i<dist.length; i++) {
            final int next = minVertex (dist, visited);
            visited[next] = true;
  
            // The shortest path to next is dist[next] and via pred[next].
  
            final ArrayList<Integer> n = dg.getSuccessors (next); 
            for (int j=0; j<n.size(); j++) {
                final int v = n.get(j);
                final int d = dist[next] + dg.getWeight(next,v);
                if (dist[v] > d) {
                dist[v] = d;
                pred[v] = next;
                }
            }
        }
        return pred;  // (ignore pred[s]==0!)
    }
  
  
    public static ArrayList getPath (int [] pred, int s, int e) {
        final java.util.ArrayList path = new java.util.ArrayList();
        int x = e;
        while (x!=s) {
           path.add (0, x);
           x = pred[x];
        }
        path.add (0, s);
        return path;
    }
 
 // Código para dibujar el grafo en GraphViz
 // Recomiendo www.webgraphviz.com/
    public static void dibujarGrafo(Digraph g){
        System.out.println("digraph Grafo {");
        System.out.println("node [color=cyan, style=filled];");
        int nv = g.size();
        for (int i = 0; i < nv; i++)
        {
           ArrayList<Integer> lista = g.getSuccessors(i);
           for (int j = 0; j < lista.size(); j++)
             System.out.println("\"" + i + "\" -> \"" + lista.get(j) + "\" [ label=\""+ g.getWeight(i,lista.get(j)) +"\"];");
        }
        System.out.println("}");
    }
    public static int maxSuccessors(Digraph graph){
        int max = graph.getSuccessors(0).size();
        int r = 0;
        for(int i = 1; i<graph.size;i++){
            if(max<graph.getSuccessors(i).size()){
                max = graph.getSuccessors(i).size();
                r = i;
            }
        }
        return r;
    }
    
    public static boolean ejercicio21(Digraph graph){
        int[] color = new int[graph.size];
        boolean[] visited = new boolean[graph.size];
        color[0]=1;
        return ejercicio21aux(graph, 0, color, visited);
    }
    public static boolean ejercicio21aux(Digraph graph, int n, int[] color, boolean[] visited){
        if(!visited[n]){
            visited[n]=true;
            for(int i : graph.getSuccessors(n)){
                if(color[i]==color[n]) return false;
                if(color[i]==0){
                    color[i]=3-color[n];
                    return ejercicio21aux(graph,i,color,visited);
                }
            }
        }
        return true;
    }
 
    public static void main(String[] args){
        DigraphAL dgal = new DigraphAL(5);
        dgal.addArc(0,1,10);
        dgal.addArc(0,2,3);
        dgal.addArc(1,2,1);
        dgal.addArc(1,3,2);
        dgal.addArc(2,1,4);
        dgal.addArc(2,3,8);
        dgal.addArc(2,4,2);
        dgal.addArc(3,4,7);
        dgal.addArc(4,3,9);

        DigraphAM dgam = new DigraphAM(5);
        dgam.addArc(0,1,10);
        dgam.addArc(0,2,3);
        dgam.addArc(1,2,1);
        dgam.addArc(1,3,2);
        dgam.addArc(2,1,4);
        dgam.addArc(2,3,8);
        dgam.addArc(2,4,2);
        dgam.addArc(3,4,7);
        dgam.addArc(4,3,9);

        System.out.println("Ejersicio 1.2 = ");
        System.out.println(maxSuccessors(dgal));
        System.out.println(maxSuccessors(dgam));
        System.out.println();

        System.out.println("Ejersicio 1.3 = ");
        System.out.println(getPath(dijsktra(dgal,0),0,3));
        System.out.println(getPath(dijsktra(dgam,0),0,3)); 
        System.out.println();


        System.out.println("Ejersicio 2.1 = ");
        DigraphAL graph1 = new DigraphAL(3);
        graph1.addArc(0,1,1);
        graph1.addArc(1,2,1);
        graph1.addArc(2,0,1);

        DigraphAL graph2 = new DigraphAL(3);
        graph2.addArc(0,1,1);
        graph2.addArc(1,2,1);

        DigraphAL graph3 = new DigraphAL(9);
        graph3.addArc(0,1,1);
        graph3.addArc(0,2,1);
        graph3.addArc(0,3,1);
        graph3.addArc(0,4,1);
        graph3.addArc(0,5,1);
        graph3.addArc(0,6,1);
        graph3.addArc(0,7,1);
        graph3.addArc(0,8,1);
        
        //false = NOT BICOLORABLE ; true = BICOLORABLE 
        System.out.println(ejercicio21(graph1));
        System.out.println(ejercicio21(graph2));
        System.out.println(ejercicio21(graph3));
        
        
        System.out.println();
        DigraphAlgorithms.dibujarGrafo(dgal);
     
 }
}
