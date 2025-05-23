import java.util.Stack;

class PrefixEvaluation {
    public static void main(String[] args) {
        String str="-9/*+5348";
        Stack<Integer> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int n=str.charAt(i)-'0';
            if(n>=0 && n<=9){
                val.push(n);
            }else{
                int v1=val.pop();
                int v2=val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
