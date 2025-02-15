//frequency of a number is greater than equal to sizeOfArray/2 is a majority element

//Boyer Moore Voting algorithm
class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,4,4,5,4,6,4,4};
        int res=0,count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]) {
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println(arr[res]);
        }else{
            System.out.println("No majority element");
        }
    }
}
