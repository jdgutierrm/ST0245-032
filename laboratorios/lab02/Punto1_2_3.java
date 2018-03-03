public class Punto1_2_3 {
    public void InsertSort(int[] arr){
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_2_3 miClase = new Punto1_2_3();
        int n = 1000000;
        int[] A = new int[n];
        for(int x = 0; x < A.length - 1; x++){
            A[x] = (int) (Math.random()*100)+1;
        }
        miClase.InsertSort(A);
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}
