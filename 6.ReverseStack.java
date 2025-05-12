import java.util.Stack;


//reverse stack in same stack
class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> s){
        if(s.size()==1) return;
        int top=s.pop();
        reverse(s);
        insertAtBottom(s,top);
    }
    public static void insertAtBottom(Stack<Integer> s,int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top=s.pop();
        insertAtBottom(s,x);
        s.push(top);
    }
}
