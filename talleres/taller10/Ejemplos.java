public class Ejemplos
{
   public static void main (String [] args){
       String nombre="Peverell";
       Arbol gen =new Arbol(nombre);
       Nodo papa = new Nodo("Señor");
       Nodo mama = new Nodo("Señora");
       gen.addRight(gen.getRaiz(),mama);
       gen.addLeft(gen.getRaiz(),papa);
       
       Nodo hijo=new Nodo("Ignotus");
       Nodo hijo0=new Nodo("Cadmus");
       gen.addRight(mama,hijo0);
       gen.addLeft(mama,hijo);
       
       Nodo hijo1=new Nodo("Antioch");
       Nodo hijo2=new Nodo("Thomas");
       gen.addRight(papa,hijo1);
       gen.addLeft(papa,hijo2);
       
       Nodo hijo3=new Nodo("SraGaunt");
       gen.addLeft(hijo2,hijo3);
       Nodo hijo6=new Nodo("Tom");
       gen.addRight(hijo2,hijo6);
       
       Nodo hijo8=new Nodo("SorvoloGaunt");
       gen.addRight(hijo1,hijo8);
       Nodo hijo7=new Nodo("Merope");
       gen.addLeft(hijo1,hijo7);
       
       Nodo hijo4=new Nodo("JamesPotter");
       gen.addLeft(hijo,hijo4);
       Nodo hijo9=new Nodo("Lily");
       gen.addRight(hijo,hijo9);
       
        Nodo hijo5=new Nodo("Charlus");
       gen.addRight(hijo0,hijo5);
       Nodo hijo00=new Nodo("Dorea");
       gen.addLeft(hijo0,hijo00);
       
       System.out.print(gen.metodoGraphViz());
       
       
    }
}
