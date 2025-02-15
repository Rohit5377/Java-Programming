
//Kaden's algorithm
class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4}; //6
        int sum=0,maxSum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
