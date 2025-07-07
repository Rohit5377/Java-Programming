class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5, 4, 3};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr, int st, int end){
        if(st>=end){
            return;
        }
        int mid=(st+end)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);
        mergeArray(arr,st,mid,end);
    }
    public static void mergeArray(int[] arr, int st, int mid, int end){

        int[] arr1=new int[mid-st+1];
        int[] arr2=new int[end-mid];
        int k=0;
        for(int i=st;i<=mid;i++){
            arr1[k++]=arr[i];
        }
        k=0;
        for(int i=mid+1;i<=end;i++){
            arr2[k++]=arr[i];
        }
        int i=0;
        int j=0;
        k=st;
        while(i<arr1.length && j<arr2.length ){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i];
                i++;
            }else{
                arr[k++]=arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            arr[k++]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            arr[k++]=arr2[j];
            j++;
        }
    }
}
