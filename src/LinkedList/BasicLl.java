package LinkedList;

public class BasicLl {
    public static class Node{

        int data;
        Node next;

        Node (int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(3);//creating a node a
        Node b=new Node(4);//creating a node b
        Node c=new Node(6);//creating a node c
        Node d=new Node(7);//creating a node d
        Node e=new Node(10);//creating a node e

        a.next=b;//conntecting a with b 3 ->4  6 7 10
        b.next=c;//conntecting a with b 3 ->4 -> 6 7 10
        c.next=d;//conntecting a with b 3 ->4  ->6-> 7 10
        d.next=e;//conntecting a with b 3 ->4 ->6-> 7-> 10


        System.out.println(a.next);//this contain next node b
        System.out.println(b);//this is node b

        // System.out.println(a.next.next.next.next.next.data);//this will give null pointer exception because the size of linked list is smaller than we want
        System.out.println(a.next.next.next.next.data);//access the e node
        System.out.println(a.next.next.next.data);//access the d node
        System.out.println(a.next.next.data);//access the c node
        System.out.println(a.next.data);//access the b node
        System.out.println(a.data);//access the a node


    }
}
