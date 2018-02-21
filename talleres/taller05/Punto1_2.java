package taller5;

public class Punto1_2 {
    public void tablas(long n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                //System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
    public static void main(String[] args){
        long T;
        long TI;
        long TF;
        TI = System.currentTimeMillis();
        Punto1_2 miClase = new Punto1_2();
        long tablas = 1000;
        miClase.tablas(tablas);
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
    
}
