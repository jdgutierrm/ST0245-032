public class Taller {
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(5, 3);
        list.insert(6, 4);
        list.insert(7, 5);
        list.insert(4, 3);
        list.insert(0, 0);
        list.insert(27,4);
        list.remove(7);
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        LinkedList list1 = new LinkedList();
        list1.insert(1, 0);
        list1.insert(2, 1);
        list1.insert(3, 2);
        list1.insert(5, 3);
        list1.insert(6, 4);
        list1.insert(7, 5);
        list1.insert(4, 3);
        list1.insert(0, 0);
        list1.insert(27,4);
        list1.remove(7);
        System.out.println();
        System.out.println(list.contains(6));
        System.out.println(max(list.getNode(0)));
        System.out.println(same(list.getNode(0),list1.getNode(0)));
        
    }
    public static int max(Node e){
        if(e.next==null) return e.data;
        return Math.max(e.data,max(e.next));
    }
    public static boolean same(Node e1, Node e2){
        if(e1==null&&e2!=null||e1!=null&&e2==null) return false;
        if(e1==null&&e2==null) return true;
        if(e1.data==e2.data)return same(e1.next,e2.next);
        return false;
    }
}
