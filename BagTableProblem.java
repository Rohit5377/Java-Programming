//see the lectur of hashset at the end for finding the statement of this problem
//find the maximum ball at a time on the table(in the hashset)--if the ball is already present on the hashset then remove,
// it otherwise add it into the hashset and print the maximum size of the set
import java.util.HashSet;
public class BagTableProblem {
    public static void main(String[] args) {
        int[] arr={2,1,1,3,2,3};
        HashSet<Integer> st=new HashSet<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(st.contains(num)){
                st.remove(num);
            }else{
                st.add(num);
                max=Math.max(max,st.size());
            }
        }
        System.out.println(max);
    }
}
