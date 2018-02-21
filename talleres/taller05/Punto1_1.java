package taller5;

public class Punto1_1 {
    public long ArraySum(int A[], int n){
        if(n == 0){
            return A[0];
        } else {
            return A[n] + ArraySum(A , n - 1);
        }
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_1 miClase = new Punto1_1();
        int espacio = 100000;
        int[]A = new int [espacio];
        for(int x = 0; x < A.length; x++){
            A[x] = (int) (Math.random()*10)+1;
        }
        System.out.print("La suma de los elementos del arreglo es: ");
        System.out.println(miClase.ArraySum(A ,A.length - 1));
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}

