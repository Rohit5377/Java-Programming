class PalindromeLinkedList {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{
            // Creating a copy of original linked list for check
            public static Node copy(Node head) {
                Node b=new Node(head.data);
                Node temp=head;
                Node head2 = b;
                while(temp.next!=null){
                    Node a=new Node(temp.next.data);
                    temp=temp.next;
                    head2.next=a;
                    head2=head2.next;
                }
                Node x=reverse(b);
                return x;
            }
            public static Boolean Palindrome(Node head1,Node head2){
                Node temp1=head1;
                Node temp2=head2;
                int x=0;
                while(temp1!=null){
                    if(temp1.data!=temp2.data) {
                        return false;
                    }
                        temp1=temp1.next;
                        temp2=temp2.next;
                }
                return true;
            }


            public static Node reverse(Node head){
                Node prev= null;
                Node cur=head;
                Node agla=null;
                while(cur!=null){
                    agla=cur.next;
                    cur.next=prev;
                    prev=cur;
                    cur=agla;
                }

                return prev;
            }
        }

        public static void main(String[] args) {
            Node a= new Node(1);
            Node b= new Node(2);
            Node c= new Node(3);
            Node d= new Node(2);
            Node e= new Node(1);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;

            display(a);
            linkedList ll=new linkedList();
            Node cop=ll.copy(a);
            display(cop);
            Boolean z=ll.Palindrome(a,cop);
            System.out.println(z);

        }
        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }
}
