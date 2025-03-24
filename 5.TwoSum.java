import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int arr[]={-1};
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(mp.containsKey(x)){
                arr=new int[]{mp.get(x),i};
            }else{
                mp.put(nums[i],i);
            }
        }
        return arr;
    }
}
