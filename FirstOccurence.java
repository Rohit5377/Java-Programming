public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,3,3,4,5};
        int left=0;
        int target=3;
        int right=arr.length-1;
        int a=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                a=mid;
                right= mid-1;
            }else if(target>arr[left]){
                left = mid+1;
            }else{
                right= mid-1;
            }
        }
        System.out.println(a);
    }
}
