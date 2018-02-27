package taller6;

import java.util.Scanner;

public class Punto2 {
    public int[] add(int[] arr, int num){
        int[] newArr = new int [arr.length + 1];
        if(arr[0] == 0){
            newArr[0] = num;
        } else {
          newArr[0] = num;
          for(int i = 0; i < arr.length; i++){
              newArr[i + 1] = arr[i];
          }
        }
        return newArr;
    }
    public static void main(String[] args){
        Punto2 miClase = new Punto2();
        int[] arr = new int[1000];
        System.out.println("Digite -1 para terminar");
        System.out.print("Digite el valor a ingresar: ");
        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        while(i > 0){
            arr = miClase.add(arr, i);
            System.out.print("Digite el valor a ingresar: ");
            i = s.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0 && arr[j + 1] != 0){
                System.out.print(arr[j] + ",");
            } else if(arr[j] != 0) {
              System.out.print(arr[j]);  
            }
        }
    }
}
