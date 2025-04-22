class InsertDeleteElementDoublyLinkeList {
        public static class Node{
            int data;
            Node next;
            Node prev;
            Node(int data){
                this.data =data;
                this.next = null;
                this.prev= null;
            }
        }
        public class  DoublyLinkedList {

            public static Node InsertAtHead(Node head, int x) {
                Node a = new Node(x);
                a.next = head;
                head.prev = a;
                head = a;
                return head;
            }

            public static void InsertAtEnd(Node head,int x){
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                Node a= new Node(x);
                temp.next=a;
                a.prev=temp;
            }

            public static void InsertAtGivenIndex(Node head,int x,int idx){
                Node temp=head;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                Node r=temp.next;
                Node a=new Node(x);
                temp.next=a;
                a.prev=temp;
                a.next=r;
                r.prev=a;
            }

            public static Node DeleteHead(Node head){
                head=head.next;
                head.prev=null;
                return head;
            }

            public static void DeleteTail(Node head){
                Node temp=head;
                while (temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;

            }

            public static void DeleteAtGivenIndex(Node head,int idx){
                Node temp=head;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                temp.next.prev=temp;
            }
        }

        public static void main(String[] args) {
            Node a= new Node(5);
            Node b= new Node(6);
            Node c= new Node(3);
            Node d= new Node(9);
            Node e= new Node(8);
            a.next=b;
            b.prev=a;
            b.next=c;
            c.prev=b;
            c.next=d;
            d.prev=c;
            d.next=e;
            e.prev=d;
            display(a);
//            display(DoublyLinkedList.InsertAtHead(a,9));
//            DoublyLinkedList.InsertAtEnd(a,1);
//            display(a);
//            DoublyLinkedList.InsertAtGivenIndex(a,2,3);
//            display(DoublyLinkedList.DeleteHead(a));
//            DoublyLinkedList.DeleteTail(a);
            DoublyLinkedList.DeleteAtGivenIndex(a,3);
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
