public class RemoveElement {
     public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static  Node tail;
    public  int size;
    /*Insert element at the end of the LinkedList */
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail = newNode;
    } 
    /*Printing list elements */
     public  void printList(){
        if(head == null){
            System.out.println("List is emnpy");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp .next;
        }
        System.out.println("null");
    }

    /*Remove element from the first of the linkedmlist */
    public int removeFirst(){
         int val;
        if(size==0)
        {
            System.out.println("Linkedlist is empty");
            return size;

        }
        else if(size==1)
        {
            val =head.data;
            size=0;
            head= tail = null;
        }
        val = head.data;
        head = head.next;
        size--;
        return val;
    }

    /*Remove element from the last of the linkedmlist */
    public int removeLast(){
         int val;
        if(size ==0)
        {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if( size== 1)
        {
            val = head.data;
            size=0;
            head= tail= null;
        }

        Node temp = head;
        int i =0;
        while(i != (size-2))
        {
            temp = temp .next;
            i++;
        }
        val = temp .next.data;
        temp.next= null;
        tail= temp;
        size--;
        return val;

    }

    public static void main(String[] args) {
        RemoveElement list = new RemoveElement();
        list.addLast(9);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(5);
        list.addLast(10);
        list.printList();
        System.out.println("Removed element is :"+list.removeFirst());
        list.printList();
        System.out.println("Removed element is :"+list.removeLast());
        list.printList();

    }
}
