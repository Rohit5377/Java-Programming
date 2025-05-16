import java.util.Stack;

class minStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
//    public MinStack() {
//       //constructor
//    }

    public void push(int val) {
        if(st.size()==0 || val<min.peek()){
            st.push(val);
            min.push(val);
        }else{
            st.push(val);
            min.push(min.peek());
        }
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        if(st.size()==0) return -1;
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
