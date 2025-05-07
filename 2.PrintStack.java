import java.util.Stack;

class PrintStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        Stack<Integer> temp=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            temp.push(x);
            st.pop();
            //  OR
            //temp.push(st.pop()); // I can replace line 16,17,18 with this line
        }
        while(temp.size()>0){
            int y=temp.pop();
            System.out.print(y+" ");
            st.push(y);
        }
        System.out.println();
        System.out.println(st);
    }
}
