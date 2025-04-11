class MergeTwoSortedLinkedList {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{
            public static Node merge(Node head1, Node head2){
                Node head=new Node(100);
                Node temp1=head1;
                Node temp2=head2;
                Node temp=head;
                while(temp1!=null&& temp2!=null){
                    if(temp1.data<temp2.data){
                        Node a=new Node(temp1.data);
                        temp.next=a;
                        temp=a;
                        temp1=temp1.next;
                    }
                    else{
                        Node a=new Node(temp2.data);
                        temp.next=a;
                        temp=a;
                        temp2=temp2.next;
                    }
                }
                if(temp1!=null){
                    temp.next=temp1;
                }
                if(temp2!=null){
                    temp.next=temp2;
                }


                return head.next;
            }

        }

        public static void main(String[] args) {
            Node a= new Node(1);
            Node b= new Node(3);
            Node c= new Node(5);
            Node d= new Node(7);
            Node e= new Node(9);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;

            Node p= new Node(2);
            Node q= new Node(4);
            Node r= new Node(6);
            Node s= new Node(8);
            Node t= new Node(10);
            Node u= new Node(12);

            p.next=q;
            q.next=r;
            r.next=s;
            s.next=t;
            t.next=u;
            display(a);
            display(p);
            linkedList ll=new linkedList();
            display(ll.merge(a,p));
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
