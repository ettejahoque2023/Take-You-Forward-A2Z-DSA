public class SizeOfList {
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
    public int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    } 

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail = newNode;
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


     public int getSize(){
        size =0;
        if(head == null){
            System.out.println("List is emnpy");
            return size;
        }
       
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp .next;
        }
        return size;
    }

    public static void main(String[] args) {
        SizeOfList list = new SizeOfList();
        list.addFirst(4);
        list.addFirst(3);
        list.addLast(5);
        list.addLast(6);
        list.printList();
        System.out.println(list.getSize());
    }
}
