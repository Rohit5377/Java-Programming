import java.util.Stack;

class ImplementQueueUsingStackPopEfficient {
    public static class Squeue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public void add(int val) {
            if(st1.size()==0) st1.push(val);
            else{
                while (st1.size() > 0) {
                    st2.push(st1.pop());
                }
                st1.push(val);
                while (st2.size() > 0) {
                    st1.push(st2.pop());
                }
            }

        }

        public int poll() {
            if (st1.size() == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else {
                return st1.peek();
            }
        }

        public int peek() {
            if (st1.size() == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else {
                return st1.peek();
            }
        }


        public static void main(String[] args) {
            ImplementQueueUsingStackPushEfficient.Squeue q=new ImplementQueueUsingStackPushEfficient.Squeue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.poll(); //to delete
            System.out.println(q.peek());
            q.poll();
            q.add(6);
            System.out.println(q.peek());

        }
    }
}
