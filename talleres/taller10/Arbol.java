public class Arbol
{
    private Nodo raiz;
    public Arbol(String a){
        raiz=new Nodo(a);
    }

    public void addRight(Nodo nod, Nodo D ){
        nod.right=D;  
    }

    public void addLeft(Nodo nod ,Nodo I){
        nod.left=I;    
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public void InOrder2(Nodo a){
        if(a!=null){
            InOrder2(a.left);   
            System.out.println(a.valor()+" ");
            InOrder2(a.right);}
    }

    public String metodoGraphViz(){
        String s ="";
        s = s + "digraph finite_state_machine { \n rankdir=TB; \n  node [shape = circle]; ";
        if(raiz !=null){
            s= GraphVizAux(raiz,s);
        }
        s+= "}";
        return s;
    }

    public String GraphVizAux(Nodo a, String s  ){
        if(a.left != null){
            s= s+ a.valor() + " -> "+ a.left.valor()+"; \n";
            s= GraphVizAux(a.left,s);
        }else if(a.right!= null && a.left==null){
            s=s+ a.valor()+"null" + " [shape=point];  \n";
            s=s + a.valor() + " -> "+ a.valor()+"null ; \n";
        }

        if(a.right != null){
            s= s+ a.valor() + " -> "+ a.right.valor()+"; \n";
            s= GraphVizAux(a.right,s);
        }else if(a.left != null && a.right==null){
            s=s+ a.valor()+"null" + " [shape=point]; \n";
            s=s + a.valor() + " -> "+ a.valor()+"null ; \n";
        }

        return s;
    }
}
