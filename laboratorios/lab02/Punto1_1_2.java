public class Punto1_1_2 {
    public int ArrayMax(int[] A,int n){
        int i;
        int max;
        int temp;
        max = A[n];
        if(n == 0){
            max = A[0];
        } else if(n != 0){
            temp = ArrayMax(A, n - 1);
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
        Punto1_1_2 miClase = new Punto1_1_2();
        int espacio = 100000;
        int[]A = new int [espacio];
        for(int x = 0; x < A.length; x++){
            A[x] = (int) (Math.random()*2000)+1;
        }
        //miClase.ArrayMax(A, A.length);
        System.out.print("el elemento mas grande del arreglo es: ");
        System.out.println(miClase.ArrayMax(A ,A.length - 1));
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}
