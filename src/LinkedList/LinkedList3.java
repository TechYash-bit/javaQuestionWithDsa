package LinkedList;

public class LinkedList3 {
    int size=0;
    Node head=null;
    Node tail=null;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void insertAtTail(int data){
        Node a=new Node(data);
        if(head==null){
            head=a;
            tail=a;
        }
        else {
            tail.next = a;
            tail = a;
        }
        size++;
    }
    public void insertAtHead(int data){
        Node a=new Node(data);
        if(head==null){
            head=a;
            tail=a;
        }else {
        a.next=head;
        head=a;}
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public int elementAt(int index){
        if(index<0 || index>=size){
            throw new RuntimeException("give valid index");
        }
        if(index==0) return head.data;
        else if(index==size) return tail.data;

        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    public void inserAt(int index,int data){

        if(index==0){
            insertAtHead(data);
        }
        else if(index==size){
            insertAtTail(data);
        }
        else{
            Node a=new Node(data);
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }

            a.next=temp.next;
            temp.next=a;
        }
    }
}
