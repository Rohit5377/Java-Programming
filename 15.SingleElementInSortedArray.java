//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//
//Return the single element that appears only once.
//
//Your solution must run in O(log n) time and O(1) space.
//
//
//
//        Example 1:
//
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2
//Example 2:
//
//Input: nums = [3,3,7,7,10,11,11]
//Output: 10
//
//
//Constraints:
//
//        1 <= nums.length <= 105
//        0 <= nums[i] <= 105

class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int st=0;
        int end=n-2;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==nums[mid^1]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return nums[st];
    }
}
