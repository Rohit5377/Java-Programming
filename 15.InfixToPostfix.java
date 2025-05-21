import java.util.Stack;

class InfixToPostfix {
    public static void main(String[] args) {
        String str="9-(5+3)*4/8";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int n=str.charAt(i)-'0';
            if(n>=0 &&n<=9){
                val.push(""+ch);
            }else if(op.size()==0 || ch=='(' ||op.peek()=='('){
                op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    val.push(v1+v2+op.peek());
                    op.pop();
                }
                op.pop();
            }
            else if(ch=='+' || ch=='-'){
                String v2=val.pop();
                String v1=val.pop();
                val.push(v1+v2+op.peek());
                op.pop();
                op.push(ch);
            }else if(ch=='*' || ch=='/'){
                if(op.peek()=='*' ||op.peek()=='/'){
                    String v2=val.pop();
                    String v1=val.pop();
                    val.push(v1+v2+op.peek());
                    op.pop();
                    op.push(ch);
                }else {
                    op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            val.push(v1+v2+op.peek());
            op.pop();
        }
        System.out.println(val.peek());
    }
}
