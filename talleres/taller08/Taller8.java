import java.util.*;

public class Taller8
{
    public static Stack<Integer> inversa (Stack<Integer> stack) { 
        if(stack.empty()) {
            return stack; 
        }else{
            Stack<Integer>n = new Stack (); 
            while (!stack.empty()) { 
                n.push(stack.pop()) ; 
            }
            return n;
        }
    }
    public static void imprimirInversa(Stack<Integer> stack){
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    public static void cola(){
        Queue<String> queue = new LinkedList<String>();
        queue.add("Juan");
        queue.add("Maria");
        queue.add("Pedro");

        while(queue.isEmpty() == false){
            System.out.println("Atendiendo a " + queue.peek());
            queue.remove();
        }

    }

    public static int polaca(String ecuacion){
        Stack<Integer> stack = new Stack<Integer>();    
        int cantidad = ecuacion.length();
        char valorS;
        int valorA;
        int resultado;

        for(int i = 0, k = 1; i < cantidad; i++, k++){
            valorS = ecuacion.charAt(cantidad - k); 
            if(valorS == '+'){
                resultado = stack.pop() + stack.pop();
                stack.push(resultado);
            } else if (valorS == '*') {    
                resultado = stack.pop() * stack.pop();
                stack.push(resultado);
            } else if (valorS == '-') {    
                resultado = stack.pop() - stack.pop();
                stack.push(resultado);
            } else if (valorS == ' '){}

            else { 
                valorA = Character.getNumericValue(valorS);
                stack.push(valorA);
            }
        }
        return stack.peek();
    }

    public static void main (String [] args){
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        inversa(stack);
        imprimirInversa(stack);
        cola();
        polaca("*6 +3 1");
    }
}
