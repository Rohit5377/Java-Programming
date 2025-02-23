
//sort array of elements 0,1,2
class DutchFlagNationalAlgo {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,2,0,1,0,2};
        int st=0,mid=0,end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,st,mid);
                st++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,end);
                end--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
