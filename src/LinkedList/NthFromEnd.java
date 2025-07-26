package LinkedList;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedListMy ll=new LinkedListMy();
        ll.insertAtLast(10);
        ll.insertAtLast(20);
        ll.insertAtLast(30);
        ll.insertAtLast(40);
        ll.insertAtLast(50);
        ll.insertAtLast(60);
        ll.insertAtLast(70);
        ll.display();

        LinkedListMy.Node result = nthNodeFromLast(ll.head, 4);
        if (result != null) {
            System.out.println("4th node from end is: " + result.data);
        } else {
            System.out.println("Invalid n or list too short");
        }
    }
    public static LinkedListMy.Node nthNodeFromLast (LinkedListMy.Node head,int n){
        LinkedListMy.Node fast = head;
        LinkedListMy.Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
