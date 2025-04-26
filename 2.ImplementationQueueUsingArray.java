

class ImplementationQueueUsingArray {
    public  static class queueA{
        int[] arr=new int[5];
        int n=arr.length;
        int r=-1;
        int f=-1;
        int size=0;
        public void add(int val){
            if(r==-1){
                r=0;
                f=0;
                arr[r]=val;
                size++;
            }else{
                r++;
                arr[r]=val;
                size++;
            }
        }
        public int poll(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x=arr[f];
            f++;
            size--;
            return x;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
        public int peek(){
            return arr[r];
        }
    }
    public static void main(String[] args) {
        queueA q=new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        q.display();
        q.poll(); //to delete
        q.display();
        System.out.println(q.peek());
        q.poll();
        q.display();
    }
}
