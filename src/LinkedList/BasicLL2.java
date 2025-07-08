package LinkedList;

public class BasicLL2 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]){
        Node a= new Node(12);
        Node b=new Node(16);
        Node c=new Node(17);
        Node d=new Node(127);
        Node e=new Node(32);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node temp=a;
        //it is use when we know the size of linked list
        for(int i=0;i<5;i++){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        // if we dont know the size of the list
        System.out.println("while");
        temp=a;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }


    }
}
