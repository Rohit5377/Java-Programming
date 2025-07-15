class SmallestDivisorInGivemThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int st=1;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            end=Math.max(end,nums[i]);
        }
        int res=1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(nums,threshold,mid)){
                res=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return res;
    }
    public boolean isPossible(int[] nums, int threshold, int div){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%div==0){
                count+=nums[i]/div;
            }else{
                count+=nums[i]/div+1;
            }
        }
        if(count>threshold){
            return false;
        }
        return true;
    }
}
