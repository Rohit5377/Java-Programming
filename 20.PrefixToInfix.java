import java.util.Stack;

class PrefixToInfix {
    public static void main(String[] args) {
        String str="-9/*+5348";
        Stack<String> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int n=str.charAt(i)-'0';
            if(n>=0 && n<=9){
                val.push(""+ch);
            }else{
                String v1=val.pop();
                String v2=val.pop();
                val.push('('+v1+ch+v2+')');
            }
        }
        System.out.println(val.peek());
    }
}
