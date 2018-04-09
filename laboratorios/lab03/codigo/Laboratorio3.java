import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Laboratorio3 {

    /**
     * Returns the product of the numbers in the list. 
     * @param list - List of integers.
     * @return An integer.
     */
    public static int multiply(List<Integer> list) {
        int product=1;
        for(int i=0;i<list.size();i++){
            product*=list.get(i);
        }
        return product;
    }

    /**
     * Insert a num at the end of the list
     * @param list - List of integers
     * 
     */
    public static void SmartInsert(List<Integer> list,int data){
        int error=0;
        for(int i=0;i<list.size();i++){
            if(data==list.get(i)){
                error=1;
            }
            else{ error=0;}
        }
        if(error==0){
            list.add(data);
        }else{System.out.print("Este numero ya esta!");}
    }

    /**
     * Este metodo hallara la mejor posicion en la que una lista
     * puede llevar el pivote
     * @param list - lista de integers
     * @return int indice de mejor pivote
     */
    public static int pivot(List<Integer> list) {
        int sum1 = 0,sum2=0; 
        for(int i:list)
            sum2 += i;
        int dif = sum2;
        int idx = 0;
        for(int x:list){
            sum2 -= x;
            sum1 += x;
            int distTemp = Math.abs(sum2 - sum1);

            if(distTemp < dif) dif = distTemp;
            else break;
            idx++;
        }
        return idx - 1;
    }

    /**
     * Tests the methods.
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7 ,9 ,11,13}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8,10,12}));

        // Multiply

        System.out.println(multiply(linked));
        System.out.println(multiply(array));
        System.out.println(pivot(linked));
        System.out.println(pivot(array));

        //insert
        int data=0;
        Scanner inserte=new Scanner(System.in);
        System.out.print("inserte un nuevo numero: ");
        data=inserte.nextInt();
        SmartInsert(linked,data);
        SmartInsert(array,data);

        System.out.print("array: "+array+" linked: "+linked);

        //Neveras
        System.out.println("NEVERAS");
        Stack<Nevera> neveras = new Stack();
        neveras.push(new Nevera(1,"HACEB"));
        neveras.push(new Nevera(2,"LG"));
        neveras.push(new Nevera(3,"IBM"));
        neveras.push(new Nevera(4,"HACEB"));
        neveras.push(new Nevera(5,"LG"));
        neveras.push(new Nevera(6,"IBM"));
        neveras.push(new Nevera(7,"HACEB"));
        neveras.push(new Nevera(8,"LG"));
        neveras.push(new Nevera(9,"IBM"));
        neveras.push(new Nevera(8,"LG"));
        neveras.push(new Nevera(9,"IBM"));
        Queue<Solicitud> solicitudes = new LinkedList<>();
        solicitudes.add(new Solicitud("EXITO", 1));
        solicitudes.add(new Solicitud("OLIMPICA", 4));
        solicitudes.add(new Solicitud("LA14", 2));
        solicitudes.add(new Solicitud("EAFIT", 10));
        ejercicio4(neveras, solicitudes);

    }
    /**
     * Clase nevera, que tendra atributos nombre(de la nevera)
     * y codigo (referencia que tendra la nevera)
     */
    static class Nevera{
        private final int code;
        private final String nombre;

        public Nevera(int codigo, String nombre) {
            this.code = codigo;
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "(" + code + "," + nombre + ")";
        }
    }
    /**
     * Clase solicitud, que tendra atributos nombre(de la nevera)
     * y numNeveras (numero de neveras a ordenar)
     */
    static class Solicitud {
        public final String nombre;
        public final int numNeveras;

        private Solicitud(String nombre, int numNeveras) {
            this.nombre = nombre;
            this.numNeveras = numNeveras;
        }
    }
    /**
     * Este metodo muestra las solicitudes de neveras que hay y las disponibles
     * @param neveras - stack de objetos tipo nevera
     * @param solicitudes - queue de objetos tipo solicitud
     */
    public static void ejercicio4(Stack<Nevera> neveras, Queue<Solicitud> solicitudes) {
        System.out.print("[\n");
        while (!solicitudes.isEmpty()) {
            Solicitud sl = solicitudes.poll();
            int i = sl.numNeveras;

            System.out.print("(");
            System.out.print(sl.nombre + ",[");

            while (i > 0 && !neveras.isEmpty()) {
                Nevera act = neveras.pop();
                System.out.print(act.toString() + ",");
                i--;
            }
            System.out.print("]),\n");
        }
        System.out.print("]\n");
    }
}
