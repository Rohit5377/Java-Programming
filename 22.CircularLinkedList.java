class CircularLinkedList {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }

        public static class linkedlist{
            //deleting head node
            public static Node DeleteHEad(Node head){
                Node temp=head;
                temp=temp.next;
                while(temp.next!=head){
                    temp=temp.next;
                }
                temp.next=head.next;
                head=head.next;

                return head;
            }

        }

        public static void main(String[] args) {
            Node a= new Node(5);
            Node b= new Node(6);
            Node c= new Node(3);
            Node d= new Node(9);
            Node e= new Node(1);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=a;
            display(a);
            linkedlist ll=new linkedlist();
            display(ll.DeleteHEad(a));
        }
        public static void display(Node head){
            Node temp=head;
            temp=temp.next;
            System.out.print(head.data+" ");
            while(temp!=head){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

}
