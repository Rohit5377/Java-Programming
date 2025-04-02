class GetElementFromLastNode {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{

            //Frist method it is not more considerable
            public static Node getElement(Node a,int n){
                Node temp=a;
                int size =0;
                while(temp!=null){
                    size++;
                    temp=temp.next;
                }
                int m=size-n+1;
                temp=a;
                for(int i=0;i<m-1;i++){
                    temp=temp.next;
                }
                return temp;
            }

        //Second Method it is also known as turtle-rabbit method and it is more considerable for interviews
            public static Node nthNodeFromEnd(Node head,int n){
                Node slow=head;
                Node fast=head;
                for(int i=1;i<n;i++){
                    fast=fast.next;
                }
                while(fast.next!=null){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }

        }

        public static void main(String[] args) {
            Node a= new Node(5);
            Node b= new Node(6);
            Node c= new Node(3);
            Node d= new Node(9);
            Node e= new Node(2);
            Node f= new Node(7);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            display(a);
            linkedList ll=new linkedList();
            Node g=ll.getElement(a,2);
            System.out.println(g.data);
            Node i=ll.getElement(a,4);
            System.out.println(i.data);
            Node h=ll.nthNodeFromEnd(a,2);
            System.out.println(h.data);
            Node j=ll.nthNodeFromEnd(a,4);
            System.out.println(j.data);

        }
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }

}
