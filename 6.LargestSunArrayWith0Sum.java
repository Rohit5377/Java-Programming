import java.util.HashMap;

class LargestSunArrayWith0Sum {
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        int sum=0,maxLength=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(arr[0],0);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(mp.containsKey(sum)){
                maxLength = Math.max(maxLength,i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }
        }
        System.out.println(maxLength);
    }
}
