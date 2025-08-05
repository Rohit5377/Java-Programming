class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int n=arr.length;
        if(arr.length<3) return false;
        if(arr[0]>=arr[1]) return false;
        while(i+1<n && arr[i]<=arr[i+1]){
            if(arr[i]==arr[i+1]){
                return false;
            }
            i++;
        }
        if(i==n-1) return false;
        for(int j=i;j<n-1;j++){
            if(arr[j]<=arr[j+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}

