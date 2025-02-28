public class SquareRoot {
    public static void main(String[] args) {
        int n=24;
        int start=0;
        int end=n;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int val=mid*mid;
            if(val==n){
                ans=mid;
                break;
            }else if(val>n){
                end=mid-1;
            }else{
                start=mid+1;
                ans=mid;
            }
        }
        System.out.println(ans);
    }
}
