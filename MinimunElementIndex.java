public class MinimunElementIndex {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        int left=0;
        int right=arr.length-1;
        int a=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=arr[arr.length-1]){
                right=mid-1;
                a=mid;
            }else{
                left=mid+1;
            }
        }
        System.out.println(a);
    }
}
