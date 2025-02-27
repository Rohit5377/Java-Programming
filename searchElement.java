public class searchElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int left=0;
        int target=4;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }else if(target>arr[left]){
                left = mid+1;
            }else{
                right= mid-1;
            }
            if(left==right && arr[mid]!=target){
                System.out.println(false);
            }
        }
    }
}
