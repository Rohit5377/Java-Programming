import java.util.Stack;

class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            res[i]=-1;
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()>0) res[i]=st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
