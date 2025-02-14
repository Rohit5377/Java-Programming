class CubeFreeProgram {
    public static void main(String[] args) {
        int n=108,b=0;
        for(int a=1;a<=Math.cbrt(n);a++){
            int a3=a*a*a;
            if(n%a3==0){
                b=n/a3;
                if(isCubeFree(b)){
                    System.out.println("a= "+ a+ " b= "+b);
                }
            }
        }
    }
    public static boolean isCubeFree(int n){
        for(int i=2;i<=Math.cbrt(n);i++){
            int c=i*i*i;
            if(n%c==0){
                return false;
            }
        }
        return true;
    }
}
