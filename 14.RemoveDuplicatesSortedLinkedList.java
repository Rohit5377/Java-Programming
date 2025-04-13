class RemoveDuplicates {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{
            public static Node removeDuplicate(Node head){
                Node temp=head;
                while(temp!=null && temp.next!=null){
                    if(temp.data==temp.next.data){
                        temp.next=temp.next.next;
                    }
                    temp=temp.next;
                }

                return head;
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
            display(ll.removeDuplicate(a));

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
