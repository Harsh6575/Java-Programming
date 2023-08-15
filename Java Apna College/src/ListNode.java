public class ListNode {

    // here question is delete n th node from end of a linkedlist
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }

    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }


        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        //removing SIZEth node from last i.e. head
        if(n == size) {
            return head.next;
        }

        //find previous node
        int ptf = size - n; // position to find
        ListNode prev = head; // previous node
        int cp = 1; // current position

        while(cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return head;

    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.val=2;
        list.val=3;
        list.removeNthFromEnd(list,1);
    }
}