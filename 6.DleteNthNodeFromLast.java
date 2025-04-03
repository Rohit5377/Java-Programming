class DleteNthNodeFromLast {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{
            public static Node deleteNode(Node head,int idx){
                Node slow=head;
                Node fast=head;
                for(int i=1;i<=idx;i++){
                    fast=fast.next;
                }
                if(fast==null){
                    head=head.next;
                    return head;
                }
                while(fast.next!=null){
                    slow=slow.next;
                    fast=fast.next;
                }
                slow.next=slow.next.next;
                return head;
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
            a=ll.deleteNode(a,6);
            display(a);

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

