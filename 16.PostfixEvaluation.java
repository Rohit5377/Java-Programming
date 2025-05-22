import java.util.Stack;

class PostfixEvaluation {
    public static void main(String[] args) {
        String str="953+4*8/-";
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int n=str.charAt(i)-'0';
            if(n>=0 && n<=9){
                val.push(n);
            }else{
                int v2=val.pop();
                int v1=val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
