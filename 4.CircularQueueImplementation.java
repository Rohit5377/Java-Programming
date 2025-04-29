class CircularQueueImplementation {
    public  static class CircularQueue{
        int[] arr=new int[5];
        int n=arr.length;
        int r=-1;
        int f=-1;
        int size=0;
        public void add(int val){
            if(size==n){
                System.out.println("Queue is full Insertion not possible");
            }
            else if(r==-1){
                r=0;
                f=0;
                arr[r]=val;
            }else if(r==n-1){
                r=0;
                arr[r]=val;
            }
            else{
                r++;
                arr[r]=val;
            }
            size++;
        }
        public int poll(){
            if(size==0 || r==f){
                System.out.println("Queue is empty!");
                return -1;
            }else{
                int x=arr[f];
                if(f==n-1) f=0;
                else f++;
                size--;
                return x;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
            }else if(f<r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }else if(r<f){
                for(int i=f;i<=n-1;i++){
                    System.out.print(arr [i]+" ");
                }
                for(int i=0;i<f;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        public int size(){
            return size;
        }
        public int peek(){
            return arr[r];
        }
    }
    public static void main(String[] args) {
        CircularQueue q=new CircularQueue();
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
        q.add(3);
        q.add(4);
        q.display();
        q.add(6);

    }
}
