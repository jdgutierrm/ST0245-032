import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedList {
private Node first;
private int size;
public LinkedList()
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
	public Node getNode(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < size) {
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
			System.exit(0);
		}

		return temp.data;
	}

// Retorna el tamaño actual de la lista
public int size()
{
	return size;
}

// Inserta un dato en la posición index
public void insert(int data, int index)
{
    size++;
    if(index == 0){
        Node temp = first;
        this.first = new Node(data);
        first.next = temp;
    }
    else{
        if(index == size-1){
            Node insert = new Node(data);
            getNode(index-1).next = insert;
            insert.next=null;
        }
        else{
            Node temp = new Node(data);
            temp.next = getNode(index);
            getNode(index-1).next = temp;
        }
    }
}

// Borra el dato en la posición index
public void remove(int index)
{
    
    if(index == 0){
        first = getNode(1);
    }
    else if(index == size-1){
        getNode(index-1).next = null;
    }
    else{
        getNode(index-1).next = getNode(index+1);
    }
    size--;
}

// Verifica si está un dato en la lista
public boolean contains(int data)
{
    Node temp = getNode(0);
    while(temp!=null){
        if(temp.data==data) return true;
        temp = temp.next;
    }
    return false;
}

}
