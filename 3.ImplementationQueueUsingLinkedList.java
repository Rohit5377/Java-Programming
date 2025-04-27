class ImplementationQueueUsingLinkedList {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=head;
        int size=0;
        public void add(int val){
            Node x=new Node(val);
                if(size==0){
                    head = tail = x;
                }else{
                    tail.next=x;
                    tail=tail.next;

                }
            size++;
        }
        public int poll(){
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public int size(){
            return size;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public int peek(){
            return head.val;
        }

        public static void main(String[] args) {
            queueLL q=new queueLL();
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
}
