public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5,res=0,b=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
            b=b^i+1;
        }
        b=b^n;
        res=res^b;
        System.out.println(res);
    }
}
