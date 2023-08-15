public class ReverseLinkedList {

    Node head;

    private int size;

    ReverseLinkedList(){
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

    public void reverseIterate(){
        if (head ==null || head.next==null){
            return;
        }

        Node previousNode=head;
        Node currNode = head.next;

        while (currNode!=null){
            Node nextNode = currNode.next;
            currNode.next=previousNode;

            previousNode=currNode;
            currNode=nextNode;
        }

        head.next=null;
        head=previousNode;
    }

    public Node reverseRecursion(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node newHead = reverseRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.printList();
//        list.reverseIterate();
        list.head = list.reverseRecursion(list.head);
        list.printList();
        System.out.print(list.getSize());
    }
}
