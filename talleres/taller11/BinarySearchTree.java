public class BinarySearchTree
{
    //El codigo fue modificado para poder se implementado con la clase dada por el profesor
    public class Node{
        public BinarySearchTree left;
        public BinarySearchTree right;
        public int data;
        public  Node (){
            data = 0; 
        }
    }

    Node root;
    public BinarySearchTree(){
        root = null; 
    }

    public void Insert(int data){
        if (root == null) {
            //Si el arbol esta vacio se crea un nodo con el valor data y luego este nodo se le asigna al arbol root y se crean los dos 
            //hijos del arbol
            Node nuevo = new Node();
            nuevo.data = data;
            nuevo.right = new BinarySearchTree();
            nuevo.left = new BinarySearchTree();
            root = nuevo;
            //Si el arbol se evalua para saber en cual rama se insertara el valor y se hace un llamado recursivo del metodo para ser insertado
        }else if (data > root.data) {
            (root.right).Insert(data);
        } else if (data < root.data){
            (root.left).Insert(data);
        }
    }

    public BinarySearchTree Search(int data){
        //Es basicamente el mismo realizado en clase
        BinarySearchTree nuevo = null;
        if (root != null) {
            if (data == root.data) {
                return this;
            } if (data < root.data) {
                nuevo = root.left.Search(data);
            }else {
                nuevo = root.right.Search(data);
            }
        }
        return nuevo;
    }

}
