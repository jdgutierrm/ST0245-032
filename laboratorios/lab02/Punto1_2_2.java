public class Punto1_2_2 {
    public int ArrayMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        return max;
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_2_2 miClase = new Punto1_2_2();
        int espacio = 100000000;
        int[]A = new int [espacio];
        for(int x = 0; x < A.length; x++){
            A[x] = (int) (Math.random()*2000)+1;
        }
        //miClase.ArrayMax(A, A.length);
        System.out.print("el elemento mas grande del arreglo es: ");
        System.out.println(miClase.ArrayMax(A));
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}

