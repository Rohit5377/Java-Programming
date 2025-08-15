import java.util.Stack;

class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }else if(i==arr.length-1 || st.peek()!=arr[i+1]){
                st.pop();
            }
        }
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,8,8,8,7,7,2,3,3,5};
        int[] res=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}


