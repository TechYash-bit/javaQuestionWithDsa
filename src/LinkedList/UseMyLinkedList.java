package LinkedList;

public class UseMyLinkedList {
    public static void main(String[] args) {
        LinkedListMy ll=new LinkedListMy();
        ll.insertAtEnd(23);
        ll.insertAtStart(22);
        //ll.display();
        ll.insertAtEnd(25);
        ll.insertAtStart(58);
        ll.display();
        System.out.println(ll.size());
    }
}
