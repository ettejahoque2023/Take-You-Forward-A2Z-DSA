public class InsertElement {
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
    public static int size;

    /*Insert element at the start of the LinkedList */
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    } 

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

    /*Insert element at the start of the LinkedList */

    public void addMiddle(int data,int idx){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx -1)
        {
            temp =temp .next;
            i++;
        }
        newNode.next=temp.next;
        temp .next=newNode;

    }


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
    public static void main(String[] args) {
        InsertElement list = new InsertElement();
        list.addFirst(4);
        list.addFirst(3);
        list.printList();
        list.addLast(6);
        list.addLast(7);
        list.printList();
        list.addMiddle(5,2);
        list.printList();
        System.out.println(size);

    }
}
