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
    void insertAtLast(int data){
        Node temp=new Node(data);
       if(head==null){
           head=temp;
           tail=temp;
           return;
       }
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }

    void insertAtStart(int data){
        Node temp=new Node(data);
         if(head==null){
             insertAtEnd(temp.data);
         }
         else{
             temp.next=head;
             head=temp;
         }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
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
    void insertAt(int index,int data){
       Node nw=new Node(data);
       Node temp=head;
       if(index==size()){
           insertAtEnd(data);
           return;
       }
       else if(index==0){
           insertAtStart(data);
           return;
       }
       else if(index<0 || index>size()){
           System.out.println("wwrong index was given");
           return;
       }
       for(int i=0;i<index-1;i++){
           temp=temp.next;
        }
       nw.next=temp.next;
       temp.next=nw;

    }

    int getElement(int index){
        if(index==0)
            return head.data;

        else if(index==size())
            return tail.data;

        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        return temp.data;


    }

    void deleteNode(int index){
        Node temp=head;
        if(index==0){
            head=head.next;
        }
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        if (temp == null || temp.next == null){
            System.out.println("invalid index");
            return;}
        temp.next=temp.next.next;
        if(temp.next.next==null){
            temp=head;
        }

    }

}
