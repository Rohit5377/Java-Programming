public class NumberOfBitRequiredToFlipAtoB {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=a^b;
        int res=0;
        while(c>0){
            c=c&(c-1);
            res++;
        }
        System.out.println(res);
    }
}
