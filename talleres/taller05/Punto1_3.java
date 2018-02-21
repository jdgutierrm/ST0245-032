package taller5;

public class Punto1_3 {
    public void Ordenar(int[] A){
        //Scanner scan = new Scanner(System.in);
        for(int i = 0; i < A.length - 1; i++){
            int j = i;
            while(j > 0 && A[j - 1] > A[j]){
                int temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
                j -= 1;
            }
        }
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_3 miClase = new Punto1_3();
        int n = 100000000;
        int[] A = new int[n];
        for(int x = 0; x < A.length - 1; x++){
            A[x] = (int) (Math.random()*100)+1;
        }
        miClase.Ordenar(A);
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}
