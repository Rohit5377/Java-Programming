import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueuePopEfficient {
    public static class Qstack1{
        Queue<Integer> q=new LinkedList<>();
        public void push(int val){
            if(q.size()==0) q.add(val);
            else{
                q.add(val);
                for(int i=0;i<q.size()-1;i++){
                    q.add(q.remove());
                }
            }
        }

        public int pop(){
            if(q.size()==0){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return q.remove();
            }
        }
        public int peek(){
            if(q.size()==0){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return q.peek();
            }
        }
    }

    public static void main(String[] args) {
        Qstack1 st=new Qstack1();
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
