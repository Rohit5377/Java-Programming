class MoveAll1AtEnd {
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,1,0,1,0,1};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
