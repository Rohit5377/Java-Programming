class MoveAll0AtEnd {
    void pushZerosToEnd(int[] arr) {
        int i=0,j=1;
        while(i<arr.length && j<arr.length){
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }else if(arr[i]==0){
                j++;
            }else{
                i++;
                j++;
            }
        }
    }
}
