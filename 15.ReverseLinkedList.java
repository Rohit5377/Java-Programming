class ReverseLinkedList {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{
         // It is used when we want to only print linkedlist in reverse order
//            public static void reverse(Node head){
//                if(head==null){
//                    return;
//                }
//                reverse(head.next);
//                System.out.print(head.data+" ");
//            }



        // It is used when we want to make reverse linked list
//            public static Node reverse(Node head){
//                if(head.next==null){
//                    return head;
//                }
//                Node newhead=reverse(head.next);
//                head.next.next=head;
//                head.next=null;
//                return newhead;
//            }
//
//        }


          // It is another mehod of upper mehtod
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
            Node a= new Node(3);
            Node b= new Node(3);
            Node c= new Node(7);
            Node d= new Node(7);
            Node e= new Node(9);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;

            display(a);
            linkedList ll=new linkedList();
            display(ll.reverse(a));

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
