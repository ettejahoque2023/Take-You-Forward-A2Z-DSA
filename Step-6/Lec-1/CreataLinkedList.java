import java.util.*;
public class CreataLinkedList {
    /*
    public class Node{
        int data;
        Node next;
        public Node (int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static  Node tail;
    public static int size;

    */

    public static void main(String[] args) {
        /*Using java collection framework */
        LinkedList<Integer> list = new LinkedList<>();
         list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
         list.addLast(3);
        list.addLast(10);
        list.addFirst(90);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        /*Using Class Node */
        
        

    }
}
