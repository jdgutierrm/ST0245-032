package Lab5;
import Talleres.*;
import java.util.*;
/**
 *
 */
public class DigraphAM extends Digraph{
    public int[][] matriz;
    public DigraphAM(int vertices){
        super(vertices);
        matriz = new int[vertices][vertices];
    }
    @Override 
    public  void addArc(int source, int destination, int weight){
        matriz[source][destination] = weight;
    }
    @Override 
    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> successors = new ArrayList<>();
        for(int i = 0; i< matriz.length;i++){
            if(matriz[vertice][i]!=0){
                successors.add(i);
            }
        }
        return successors;
    }
    @Override 
    public int getWeight(int source, int destination){
        return matriz[source][destination];
    }
    @Override 
    public  int size() {return size;}
}
