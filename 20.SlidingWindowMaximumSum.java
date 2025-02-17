class SlidingWindowMaximumSum {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 1, 3, 2};
        int max=0;
        int sum=0;
        int k=3;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<arr.length;i++){
            sum= sum+arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
