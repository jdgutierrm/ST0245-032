
import java.util.HashMap;
import java.util.*;

public class Taller9{

    //Pedrito 2
    public static void add(HashMap empresas,String key, String value){
        empresas.put(key,value);
    }

    //Pedrito 3
    public static void search(HashMap empresas,String key){
        System.out.println(empresas.get(key));
    }

    public static boolean contienekey(HashMap empresas,String value){
        return empresas.containsValue(value);
    } 

    public static void main(String [] args){

        HashMap empresas = new HashMap();
        add(empresas, "Google", "Estados Unidos");
        add(empresas, "La locura", "Colombia");
        add(empresas, "Nokia", "Finlandia");
        add(empresas, "Sony", "Japon");
        search(empresas, "Google");
        search(empresas, "Motorola");
        System.out.println(contienekey(empresas,"India"));

    }

}
