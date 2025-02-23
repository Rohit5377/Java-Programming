import java.util.Arrays;

class CandyProblemMinimumDifference {
    public static void main(String[] args) {
        int[] arr={7,3,1,8,9,12,56};
        int m=3;
        Arrays.sort(arr);
        int res=arr[m-1]+arr[0];
        for(int i=1;i+m-1<arr.length;i++){
            res=Math.min(res,arr[i+m-1]-arr[i]);
        }
        System.out.println(res);
    }
}
