package LinkedList;

public class LinkedListMy {
    Node head=null;
    Node tail=null;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    void insertAtEnd(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }

    void insertAtStart(int data){
        Node temp=new Node(data);
         if(head==null){
             head=temp;tail=temp;
         }
         else{
             temp.next=head;
             head=temp;
         }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

}
