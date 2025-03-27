import java.util.HashSet;

class LongestConsecutiveElementsSequence {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,5,2};
        HashSet<Integer> st=new HashSet<>();
        for(int i:arr){
            st.add(i);
        }

        int maxCount=1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            int currElement=arr[i];
            if(!st.contains(currElement-1)){
                while(st.contains(currElement+1)){
                    count++;
                    currElement++;

                }
                maxCount=Math.max(count,maxCount);
            }
        }
        System.out.println(maxCount);
    }
}
