import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueuePushEfficient {
    public static class Qstack{
        Queue<Integer> q=new LinkedList<>();
        public void push(int val){
            q.add(val);
        }

        public int pop(){
            if(q.size()==0){
                System.out.println("Queue is empty");
                return -1;
            }else{
               for(int i=0;i< q.size()-1;i++){
                    q.add(q.remove());
                }
                int x=q.remove();
                return x;
            }
        }
        public int peek(){
            if(q.size()==0){
                System.out.println("Queue is empty");
                return -1;
            }else{
                for(int i=0;i< q.size()-1;i++){
                    q.add(q.remove());
                }
                int x=q.peek();
                q.add(q.remove());
                return x;
            }
        }
    }

    public static void main(String[] args) {
        Qstack st=new Qstack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(4);
        System.out.println(st.peek());
    }
}
