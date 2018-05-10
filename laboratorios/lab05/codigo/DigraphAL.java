package Lab5;
import Talleres.*;
import java.util.*;
import java.util.ArrayList;

/**
 *
 */
public class DigraphAL extends Digraph{
    LinkedList<Pareja>[] list;
    public DigraphAL(int vertices){
        super(vertices);
        list = new LinkedList[vertices];
        for(int i = 0; i<list.length;i++){
            list[i] = new LinkedList<>();
        }
    }
    @Override 
    public  void addArc(int source, int destination, int weight){
        list[source].add(new Pareja(destination,weight));
    }
    @Override 
    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> alist = new ArrayList();
        for(Pareja n : list[vertice]){
            alist.add(n.vertice);
        }
        return alist;
    }
    @Override 
    public int getWeight(int source, int destination){
        for(Pareja n : list[source]){
            if(n.vertice==destination) return n.peso;
        }
        return 0;
    }
    @Override 
    public  int size() {return size;}
}
