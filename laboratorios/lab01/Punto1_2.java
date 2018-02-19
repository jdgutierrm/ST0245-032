import java.util.Random;

public class Punto1_2 {
    public int ArrayMax(int A[], int n){
        int max;
        int temp; 
        max = A[n];
        if(n == 0){
            max = A[0];
        }
        if(n != 0){
            temp = ArrayMax(A, n-1);
            if(temp > max){
                max = temp; 
            } 
        }
        return max;
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_2 miClase = new Punto1_2();
        int espacio = 10000;
        int[]A = new int [espacio];
        for(int x = 0; x < A.length; x++){
            A[x] = (int) (Math.random()*1024)+1;
        }
        System.out.print("El numero mayor del arreglo es: ");
        System.out.println(miClase.ArrayMax(A ,A.length - 1));
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}

