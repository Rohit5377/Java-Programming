class ImplementStackUsingArray {
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;
        void push(int x){
            if(idx==5){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return x;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==5)  return true;
            else return false;
        }

        public static void main(String[] args) {
            Stack st=new Stack();
            System.out.println(st.isEmpty());
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            st.display();
            System.out.println(st.size());
            System.out.println(st.isFull());
            st.pop();
            st.display();
        }
    }
}
