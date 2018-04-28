public class Nodo
{
    protected Nodo left,right;
    private String data;

    public Nodo(String d){
        data=d;
    }

    public String valor(){
        return data;
    }
}
