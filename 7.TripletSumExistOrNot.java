class TripletSumExistOrNot {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,9,12,14};
        int t=26;
        System.out.println(isPresent(arr,t));

    }
    public static boolean isPresent(int[] arr,int t){

        for(int i=0;i<arr.length;i++){
            int st=i+1;
            int end=arr.length-1;
            int x=t-arr[i];
            while(st<end){
                int sum=arr[st]+arr[end];
                if(x==sum){
                    return true;
                }else if(sum<x){
                    st++;
                }else{
                    end--;
                }
            }
        }
        return false;
    }
}
