class OddEvenSubArrayLength {
    public static void main(String[] args) {
        int[] arr={2,5,3,2,4,4,2,5,6,7};
        int count=1;
        int size=1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 &&arr[i-1]%2==0)){
                count++;
                size=Math.max(size,count);
            }else{
                count=1;
            }
        }
        System.out.println(size);
    }
}
