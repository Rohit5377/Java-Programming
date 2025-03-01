import java.util.ArrayList;
import java.util.List;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] a={1,2,3,};
        permu(a);
    }

    public static void permu(int[] arr) {
        List<List<Integer>> ans= new ArrayList<>();
        per(ans,0,arr);
        System.out.println(ans);
    }

    public static void per(List<List<Integer>> ans, int idx,int[] arr){
        if (idx==arr.length-1){
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                a.add(arr[i]);
            }
            ans.add(a);
        }
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            per(ans,idx+1,arr);
            swap(i,idx,arr);
        }
    }
    public static void swap(int i,int idx,int[] arr){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }


}
