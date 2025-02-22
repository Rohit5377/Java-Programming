import java.util.ArrayList;
import java.util.List;

class SubArrayIndexReturnEqualToTarget {
    public static void main(String[] args) {
        int[] arr={1,10,4,0,3,5};
        int target=7;
        System.out.println(targetIndex(arr,target));

    }

    public static List<Integer> targetIndex(int[] arr,int target){
        int st=0;
        int sum=0;
        List<Integer> list=new ArrayList<>();
        for(int e=0;e<arr.length;e++){
            sum+=arr[e];
            while(sum>target){
                sum -=arr[st++];
            }
            if(sum==target){
                list.add(st+1);
                list.add(e+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
