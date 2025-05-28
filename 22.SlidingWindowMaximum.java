import java.util.Stack;

class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int n=arr.length;
        int k=3;
        int[] arr1=new int[n-k+1];
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[n];
        st.push(n-1);
        nge[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0) nge[i]=n;
            else nge[i]=st.peek();
            st.push(i);
        }
        int z=0;
        for(int i=0;i<n-k+1;i++){
            int j=i;
            int max=arr[j];
            while(j<i+k){
                max=arr[j];
                j=nge[j];
            }
            arr1[z++]=max;
        }
        for(int i=0;i<n-k+1;i++){
            System.out.println(arr1[i]);
        }

    }
}
