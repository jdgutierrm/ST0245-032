
public class TablaDeHash
{

   private int[] tabla;

   public TablaDeHash(){
      tabla = new int[10];
   }

   private int funcionHash(String k){
       return ((int) k.charAt(0)) % 10;
   }

   public int get(String k){
      return tabla[funcionHash(k)];
    }


   public void put(String k, int v){
      int location = funcionHash(k);
      if(tabla[location]== 0){
         tabla[location] = v;
      } else {
         for(int i = 0; i < tabla.length; i ++){
            if(tabla[i]== 0){
               tabla[i]= v;
               break;
            }
         }
      }

   }
}
