class ProductExceptIthElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1=new int[arr.length];
        arr1[0]=arr[0];
        int pro=1;
        for(int i=1;i<arr.length;i++){
            arr1[i]=arr1[i-1]*arr[i];
        }
        for(int i=arr.length-1;i>0;i--){
            arr1[i]=arr1[i-1]*pro;
            pro*=arr[i];
        }
        arr1[0]=pro;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
