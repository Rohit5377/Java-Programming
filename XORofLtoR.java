public class XORofLtoR {
    public static void main(String[] args) {
        int l=4,r=8;
        int res= findXor(l-1)^findXor(r);
        System.out.println(res);
    }
    public static int findXor(int n){
        int mod=n%4;  //  1->1,  2->n+1,  3->0,  4->n
        if(mod==0){
            return n;
        }else if(mod==1){
            return 1;
        }else if(mod==2){
            return n+1;
        }else{
            return 0;
        }
    }
}
