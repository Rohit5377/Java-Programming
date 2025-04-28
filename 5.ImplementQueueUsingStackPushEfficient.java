import java.util.Stack;

class ImplementQueueUsingStackPushEfficient {
    public static class Squeue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public void add(int val) {
            st1.push(val);
        }

        public int poll() {
            if (st1.size() == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else {
                while (st1.size() > 1) {
                    st2.push(st1.pop());
                }
                int x = st1.pop();
                while (st2.size() > 0) {
                    st1.push(st2.pop());
                }
                return x;
            }
        }

        public int peek() {
            if (st1.size() == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else {
                while (st1.size() > 1) {
                    st2.push(st1.pop());
                }
                int x = st1.peek();
                while (st2.size() > 0) {
                    st1.push(st2.pop());
                }
                return x;
            }
        }


        public static void main(String[] args) {
            Squeue q=new Squeue();
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
