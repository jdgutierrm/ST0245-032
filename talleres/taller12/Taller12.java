package Talleres;
import java.util.*;
public class Taller12 {
    public static void main(String args[]){
        Graph g = new DiagraphAM(12);
        g.addArc(5,11,1);
        g.addArc(11,2,1);
        g.addArc(11,9,1);
        g.addArc(11,10,1);
        g.addArc(7,8,1);
        g.addArc(7,11,1);
        g.addArc(8,9,1);
        g.addArc(3,8,1);
        g.addArc(3,10,1);
        dfs(g,7);
        System.out.println();
        bfs(g,7);
        System.out.println();
        System.out.println(existedfs(g,7,10));
        System.out.println(existebfs(g,7,9));
    }
    public static void dfs(Graph g, int v) {
        boolean[] visitados = new boolean[g.size()];
        dfsAux(g, v, visitados);
    }
    public static void dfsAux(Graph g, int v, boolean[] vi){
        Stack<Integer> stack = new Stack();
        stack.add(v);
        System.out.print(v);
        vi[v] = true;
        ArrayList<Integer> list;
        while(!stack.isEmpty()){
            list = g.getSuccessors(v);
            if(list.isEmpty()){
                stack.pop();
                v = stack.peek();
            }
            else{
                while(!list.isEmpty()&&vi[list.get(0)]){
                        list.remove(0);
                }
                if(list.isEmpty()){
                    stack.pop();
                    if(!stack.empty())v = stack.peek();
                }
                else{
                    v=list.get(0);
                    vi[v]=true;
                    stack.push(v);
                    System.out.print(", "+v);
                }
            }
        }
    }
    public static void bfs(Graph g, int v) {
        boolean[] visitados = new boolean[g.size()];
        bfsAux(g, v, visitados);
    }
    public static void bfsAux(Graph g, int v, boolean[] vi){
        Queue<Integer> queue = new LinkedList();
        queue.add(v);
        System.out.print(v);
        vi[v] = true;
        ArrayList<Integer> list;
        while(!queue.isEmpty()){
            list = g.getSuccessors(queue.poll());
            while(!list.isEmpty()){
                if(!vi[list.get(0)]){
                    vi[list.get(0)] = true;
                    queue.add(list.get(0));
                    System.out.print(", "+list.get(0));
                }
                list.remove(0);
            }
            
        }
    }
    public static boolean existedfs(Graph g, int i, int j){
        boolean[] visitados = new boolean[g.size()];
        return existedfsAux(g, i,j, visitados);
    }
    public static boolean existedfsAux(Graph g, int v,int j, boolean[] vi){
        Stack<Integer> stack = new Stack();
        stack.add(v);
        if(v==j) return true;
        vi[v] = true;
        ArrayList<Integer> list;
        while(!stack.isEmpty()){
            list = g.getSuccessors(v);
            if(list.isEmpty()){
                stack.pop();
                v = stack.peek();
            }
            else{
                while(!list.isEmpty()&&vi[list.get(0)]){
                        list.remove(0);
                }
                if(list.isEmpty()){
                    stack.pop();
                    if(!stack.empty())v = stack.peek();
                }
                else{
                    v=list.get(0);
                    vi[v]=true;
                    stack.push(v);
                    if(v==j) return true;
                }
            }
        }
        return false;
    }
    public static boolean existebfs(Graph g, int i,int j) {
        boolean[] visitados = new boolean[g.size()];
        return existebfsAux(g, i,j, visitados);
    }
    public static boolean existebfsAux(Graph g, int v,int j, boolean[] vi){
        Queue<Integer> queue = new LinkedList();
        queue.add(v);
        if(v==j) return true;
        vi[v] = true;
        ArrayList<Integer> list;
        while(!queue.isEmpty()){
            list = g.getSuccessors(queue.poll());
            while(!list.isEmpty()){
                if(!vi[list.get(0)]){
                    vi[list.get(0)] = true;
                    queue.add(list.get(0));
                    if(list.get(0)==j) return true;
                }
                list.remove(0);
            }
            
        }
        return false;
    }
}
