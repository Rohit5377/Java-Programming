class BubbleSort {
//    public static void main(String[] args) {
//        int[] arr={2,4,6,5,4,3};
//        int n=arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }

    //Optimized code when partial array is sorted or arr become sorted in starting iterations
    public static void main(String[] args) {
        int[] arr={2,4,6,5,4,3};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
