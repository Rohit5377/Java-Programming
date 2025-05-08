import java.util.Stack;

class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack = "+ st);

        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }

        Stack<Integer> copySt=new Stack<>();
        while(temp.size()>0){
            copySt.push(temp.pop());
        }
        System.out.println("Copied Stack = "+ copySt);
    }
}
