
//Array contains duplicate elements
 class SearchElementInRotatedArrayll {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]==nums[st] && nums[mid]==nums[end]){
                st++;
                end--;
            }
            else if(nums[mid]>=nums[st]){
                if(target>=nums[st] && target<nums[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
