
//change kth bit
public class ToggleKthBit {
    public static void main(String[] args) {
        int a=8;
        int k=2;
        int res=1<<(k-1);
        System.out.println(a^res);
    }
}
