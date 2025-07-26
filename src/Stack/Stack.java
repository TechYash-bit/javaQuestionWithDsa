package Stack;

public class Stack {
   private Node head=null;
    private int size=0;

    void push(int x){
        Node temp=new Node();
        temp.val=x;
        temp.next=head;
        head=temp;
        size++;
    }
    int peek(){
        if(head==null) {
            System.out.println("stack is empty");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if(head==null) {
            System.out.println("stack is empty");
            return -1;
        }
        int top= head.val;
        head=head.next;
        size--;
        return  top;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        if(head==null) return true;
        else return false;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}
