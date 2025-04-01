 class DeleteNodeByDataOfElement {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{

            void delete(Node node) {
                node.data=node.next.data;
                node.next=node.next.next;
            }
        }

        public static void main(String[] args) {
            Node a= new Node(5);
            Node b= new Node(6);
            Node c= new Node(3);
            Node d= new Node(9);
            a.next=b;
            b.next=c;
            c.next=d;
            display(a);
            linkedList ll=new linkedList();
            ll.delete(c);
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
