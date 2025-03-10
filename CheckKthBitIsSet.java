public class CheckKthBitIsSet {
    public static void main(String[] args) {
        int a=5;
        int k=3;
        a=a>>(k-1);
        System.out.println((a&1)==1);
    }
}
