public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int n=8;
        int m=(n&(n-1));
        boolean res=(n!=0 && m==0);
        System.out.println( res   );
    }
}
