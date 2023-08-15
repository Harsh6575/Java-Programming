public class LinkList1 {

    Node head;

    private int size;

    LinkList1(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode=currentNode.next;
        }

        currentNode.next=newNode;
    }

    public void deleteFirst() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    public void deleteLast(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next==null){
              head=null;
              return;
        }

        Node SecondLast = head;
        Node LastNode=head.next;

        while (LastNode.next!=null){
            LastNode=LastNode.next;
            SecondLast=SecondLast.next;
        }

        SecondLast.next=null;
    }

    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkList1 list = new LinkList1();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
