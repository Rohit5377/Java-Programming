class MiddleElement {
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
                Node slow=head;
                Node fast=head;
                //    for odd terms    for right middle in even
                while(fast!=null       && fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }


//                for let middle for even terms like in this examle for getting 6 as a middle element
//                while(fast!=null&& fast.next.next!=null){
//                    slow=slow.next;
//                    fast=fast.next.next;
//                }

                return slow;
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
            display(a);
            linkedlist ll=new linkedlist();
            System.out.println(ll.middleElement(a).data);
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
