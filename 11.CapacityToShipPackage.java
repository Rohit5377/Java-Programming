class CapacityToShipPackage {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int st=Integer.MIN_VALUE;
        int end=0;
        int res=0;
        for(int i=0;i<n;i++){
            st=Math.max(st,weights[i]);
            end+=weights[i];
        }
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(weights,days,mid)){
                res=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return res;
    }
    public boolean isPossible(int[] weights, int d, int capacity){
        int n=weights.length;
        int count=1;
        int qty=0;
        for(int i=0;i<n;i++){
            if((qty+weights[i])<=capacity){
                qty+=weights[i];
            }else{
                qty=weights[i];
                count++;
            }
        }
        if(count>d){
            return false;
        }
        return true;
    }
}
