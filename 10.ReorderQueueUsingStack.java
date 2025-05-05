import java.util.*;
import java.util.Queue;
import java.util.Stack;

//1,2,3,4,5,6,7,8 -> 1,5,2,6,3,7,4,8
class ReorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> qt=new LinkedList<>();
        Stack<Integer> st= new Stack<>();
        qt.add(1);
        qt.add(2);
        qt.add(3);
        qt.add(4);
        qt.add(5);
        qt.add(6);
        qt.add(7);
        qt.add(8);
        int n= qt.size();
        System.out.println(qt);
        for(int i=0;i<n/2;i++){
            st.push(qt.remove());
        }
        while(st.size()>0){
            qt.add(st.pop());
        }
        for(int i=0;i<n/2;i++){
            st.push(qt.remove());
        }
        while(st.size()>0){
            qt.add(st.pop());
            qt.add(qt.remove());
        }
        for(int i=0;i<n;i++){
            st.push(qt.remove());
        }
        while(st.size()>0){
            qt.add(st.pop());
        }
        System.out.println(qt);
    }
}
