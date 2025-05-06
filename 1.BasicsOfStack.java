import java.util.Stack;

class BasicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        //adding element in stack
        st.push(1);
        st.push(2);
        st.push(5);
        //print all elements of stack
        System.out.println(st);
        //print size of stack
        System.out.println(st.size());
        //print value of top
        System.out.println(st.peek());
        //delete element of top
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
    }
}
