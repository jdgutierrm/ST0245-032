public class Punto1_3 {
    public long fibonacci(int n){
        if(n <= 1){
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_3 miClase = new Punto1_3();
        int n = 10;
        System.out.print("El valor en la posicion " + n + " de la serie es: ");
        System.out.println(miClase.fibonacci(n));
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
}
