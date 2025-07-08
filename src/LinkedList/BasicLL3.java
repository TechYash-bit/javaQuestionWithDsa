package LinkedList;

public class BasicLL3 {
    public static void display(Node head){

        while(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static  void displayRec(Node head){

        if(head==null){
            return;
        }
        System.out.println(head.data + " ");
        displayRec(head.next);
    }
    public static  void displayRev(Node head){

        if(head==null){
            return;
        }
        displayRev(head.next);
        System.out.println(head.data + " ");
    }

    public static int length(Node head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }

    public static  int length(Node head ,int len){
        if(head==null) return len;
        return length(head.next,len+1);

    }


    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static  void main(String args[]){
        Node a=new Node(3);//creating a node a
        Node b=new Node(4);//creating a node b
        Node c=new Node(6);//creating a node c
        Node d=new Node(7);//creating a node d
        Node e=new Node(10);//creating a node e

        a.next=b;//conntecting a with b 3 ->4  6 7 10
        b.next=c;//conntecting a with b 3 ->4 -> 6 7 10
        c.next=d;//conntecting a with b 3 ->4  ->6-> 7 10
        d.next=e;//conntecting a with b 3 ->4 ->6-> 7-> 10

        displayRev(a);
        int len=length(a);
        System.out.println("length is "+len);
        int l=length(a,0);
        System.out.println(l);

    }
}
