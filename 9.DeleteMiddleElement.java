class DeleteMiddleElement {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }

        public static class linkedlist{

            public Node middleElement(Node head){
                if(head.next==null){
                    return null;
                }
                Node slow=head;
                Node fast=head;
                //   for right middle in even    for odd term
                while(fast.next.next!=null && fast.next.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                slow.next=slow.next.next;


                //  for let middle for even terms like in this examle for getting 6 as a middle element
//                while(fast.next.next.next.next!=null&& fast.next.next.next!=null){
//                    slow=slow.next;
//                    fast=fast.next.next;
//                }

                return head;
            }
        }

        public static void main(String[] args) {
            Node a= new Node(5);
            Node b= new Node(6);
            Node c= new Node(3);
            Node d= new Node(9);
            //Node e= new Node(1);
            a.next=b;
            b.next=c;
            c.next=d;
            //d.next=e;
            display(a);
            linkedlist ll=new linkedlist();
            Node x=ll.middleElement(a);
            display(x);
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
