import java.util.*;
public class Banco
{
    public static void main(){
        LinkedList<String>[] Filas = new LinkedList [4];
        Filas[0]=new LinkedList<String>();
        Filas[1]=new LinkedList<String>();
        Filas[2]=new LinkedList<String>();
        Filas[3]=new LinkedList<String>();
        
        Filas[0].add("Juan");
        Filas[0].add("Camilo");
        Filas[0].add("Maria");
        Filas[1].add("Estefania");
        Filas[1].add("Alejandra");
        Filas[1].add("Dalas");
        Filas[1].add("Wismichu");
        Filas[2].add("Daniel");
        Filas[2].add("Luisito");
        Filas[3].add("Sebastian");
        Filas[3].add("Andrea");
        start(Filas) ;
    }
    
    public static boolean isEmpty(LinkedList<String>[] cola){
        for(int i=0;i<cola.length;i++){
            if(!cola[i].isEmpty()){
                return true ;
            }
        }
        return false;
    }
    
    public static void start(LinkedList<String>[] Filas){
        int i=0;
        int caj=1;
        while(isEmpty(Filas)){
            if (!Filas[i].isEmpty()){
                System.out.println("El cliente " + Filas[i].pollFirst() + " está ubicado en el cajero " + (((caj+1)%2)+1) ) ; 
            }
            i++;
            i%=4;
            caj++;
        }
    }
}
