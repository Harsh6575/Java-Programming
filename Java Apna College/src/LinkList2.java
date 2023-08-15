import java.util.LinkedList;

public class LinkList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addLast("a");
        System.out.println(list);
        System.out.print(list.size());
    }
}
