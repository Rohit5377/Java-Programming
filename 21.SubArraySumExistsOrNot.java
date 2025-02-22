class SubArraySumExistsOrNot {
    public static void main(String[] args) {
        int[] arr={1, 4, 20, 3, 10, 5};
        int target=33;
        int sum=0,st=0,indicator=0;
        for(int e=0;e<arr.length;e++){
            sum+=arr[e];
            while(sum>target){
                sum=sum-arr[st];
                st++;
            }
            if(sum==target){
                System.out.println("true");
                indicator++;
                break;
            }
        }
        if(indicator==0){
            System.out.println("False");
        }
    }
}
