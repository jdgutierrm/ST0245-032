import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
    private Node first;
    private int size;
    public LinkedListMauricio()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index <= size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            //System.exit(0);
        }

        return temp.data;
    }

    /**
     * Retorna el tamaño actual de la lista
     * @return size
     */
    public int size()
    {
                return size; 
    }

   /**
     * Inserta un dato en la posición index
     * @param data - dato a insertar
     *        index - Posición en la cual se inserta
     * @return void
     */
    public void insert(int data, int index)
    {   
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();           
        }
        if(index == 0){
            Node nuevo = new Node(data);
            nuevo.next = first;
            first = nuevo;
            ++size;
        } 
        else {
            Node nuevo = new Node(data);
            Node aux = first;
            for(int i=1; i<=index-1; ++i){
               aux = aux.next;
            }
            nuevo.next = aux.next;
            aux.next = nuevo;
            ++size;
        }
     }

    /**
     * Borra el dato en la posición index
     * @param index - Indice a borrar
     * @return void
     */
    public void remove(int index)
    {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();           
        }
        if(index == 0){
            Node aux = first;
            first = aux.next;
            --size;
        } 
        else {
            Node aux = first;
            for(int i=1; i<=index-1; ++i){
               aux = aux.next;
            }
            aux.next = aux.next.next;
            --size;
        }
    }

    /**
     * Verifica si está un dato en la lista
     * @param data - dato a buscar en la lista
     * @return void
     */
    public boolean contains(int data)
    {
        if(first!=null){
            for(int i=0;i<size;i++){
             if(get(i)==data){
                 return true;
                }
            }
        }
        return false;
    }

}
