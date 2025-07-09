class PeakElement {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int st=0;
        int end=n-1;
        int index=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                index=mid;
                break;
            }else if(arr[mid+1]>arr[mid]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return index;
    }
}
