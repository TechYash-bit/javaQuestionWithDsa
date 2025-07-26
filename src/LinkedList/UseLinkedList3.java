package LinkedList;

public class UseLinkedList3 {
    public static void main(String[] args) {
        LinkedList3 list=new LinkedList3();

        list.insertAtHead(10);
       // list.display();
        list.insertAtTail(12);
        list.insertAtTail(15);
        list.insertAtHead(17);
        list.display();
        list.inserAt(2,3);
        list.display();
        System.out.println(list.elementAt(2));


    }
}
