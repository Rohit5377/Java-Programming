public class permutation {
    public static void main(String[] args) {

        printp("abc","");
    }
    public static void printp(String str, String str1){
        if(str.equals("")){
            System.out.println(str1);
            return;
        }
        for(int i=0;i<str.length();i++){
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String str2=left+right;
            printp(str2,str1+str.charAt(i));
        }
    }
}
