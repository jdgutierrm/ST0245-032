public class Punto1_2_1 {
    public int ArraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_2_1 miClase = new Punto1_2_1();
        int espacio = 1000000;
        int[]A = new int [espacio];
        for(int x = 0; x < A.length; x++){
            A[x] = (int) (Math.random()*10)+1;
        }
        System.out.print("La suma de los elementos del arreglo es: ");
        System.out.println(miClase.ArraySum(A));
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}
