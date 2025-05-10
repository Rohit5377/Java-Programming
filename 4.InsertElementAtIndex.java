import java.util.Stack;

class InsertElementAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int idx=2;// I am using 0 base indexing
        int val=6;
        Stack<Integer> temp=new Stack<>();
        //Removing element till we don't reach the index of insertion
        while(st.size()>idx){
            temp.push(st.pop());
        }
        //inserting value on index
        st.push(val);
        //again inserting remaining value in the original stack
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
