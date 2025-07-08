package LinkedList;

public class MakeLinkedList {
    public static void main(String[] args) {
        LL ll=new LL();
        ll.insertFirst(60);
        ll.insertFirst(70);
        ll.insertFirst(80);
        ll.insertFirst(90);
        ll.insertFirst(60);
        ll.insertFirst(50);
        ll.insertLast(555);
        ll.insertLast(585);

        ll.display();
    }
}
