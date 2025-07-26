package Stack;

import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        System.out.println("using a function is empty");
        System.out.println(st.empty());
        System.out.println("insert some element in stack");
        st.push(10);
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println(st);


        System.out.println("retrive element on top");
        System.out.println(st.peek());

        System.out.println("remove some element on top");
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println("printing an size ");
        System.out.println(st.size());


    }
}
