public class SearchAnEle {
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

    public int search(int data){
        if(head==null){
            System.out.println("List is empty");
            return 0;
        }
        Node temp = head;
        int i=1;
        while(temp.next!=null){
            if(temp.data == data){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        SearchAnEle list = new SearchAnEle();
        list.addLast(9);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(5);
        list.addLast(10);

        System.out.println(list.search(8));
    }
}
