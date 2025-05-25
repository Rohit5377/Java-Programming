import java.util.Stack;

class PostfixToPrefix {
    public static void main(String[] args) {
        String str="953+4*8/-";
        Stack<String> val=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int n=str.charAt(i)-'0';
            if(n>=0 && n<=9){
                val.push(""+ch);
            }else{
                String v2=val.pop();
                String v1=val.pop();
                val.push(ch+v1+v2);
            }
        }
        System.out.println(val.peek());
    }
}
