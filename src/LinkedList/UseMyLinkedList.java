package LinkedList;

import org.w3c.dom.Node;

public class UseMyLinkedList {
    public static void main(String[] args) {
        LinkedListMy ll = new LinkedListMy();
        ll.insertAtEnd(23);
        ll.insertAtStart(22);
        //ll.display();
        ll.insertAtEnd(25);
        ll.insertAtStart(58);
        ll.display();
        System.out.println(ll.size());

        ll.insertAt(2, 12);
        ll.display();
        ll.insertAtLast(23);
        ll.display();
        System.out.println("delete before");
        ll.deleteNode(6);
        System.out.println("after");
        ll.display();

        System.out.println(ll.getElement(2));

    }


    
}
