import java.util.HashMap;
import java.util.Map;

class MaximmFrequency {
    public static void main(String[] args) {
        int[] arr={2,2,4,4,4,3,2,1,4,4,1,2,3};
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int maxF=0;
        int maxKey=0;
        for(var i:mp.keySet()){
            if(mp.get(i)>maxF){
                maxF=mp.get(i);
                maxKey=i;
            }
        }

        System.out.println("Number = "+maxKey);
        System.out.println("Frequency = "+maxF);
    }
}
