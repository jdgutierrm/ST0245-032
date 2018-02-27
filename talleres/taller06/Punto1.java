package taller6;

public class Punto1 {
    public int size(int[] arr){
        return arr.length - 1;
    }
    public int get(int[] arr,int posicion){
        return arr[posicion];
    }
    public int[] add(int[] arr,int num){
        if(arr[0] == 0){
            arr[0] = num;
        } else {
            int n = 0;
            while(arr[n] != 0){
                n += 1;
            }
            arr[n] = num;
        }
        return arr;
    }
    public static void main(String[] args){
        Punto1 miClase = new Punto1();
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 8;
        System.out.println(miClase.size(arr));
        System.out.println(miClase.get(arr, 1));
        int []arr2 = miClase.add(arr, 12);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + ",");
        }
        
    }
}
