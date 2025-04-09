class CycleLinkedListOrNot {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }

        public static class linkedlist{

            public Boolean hasCyclic(Node head){
                if(head==null){
                    return false;
                }
                if(head.next==null){
                    return false;
                }
                Node slow=head;
                Node fast=head;
                while(fast!=null){
                    if(slow==null) return false;
                    slow=slow.next;
                    if(fast==null) return false;
                    fast=fast.next.next;
                    if(fast==slow){
                        return true;
                    }
                }
                return false;
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
            d.next=b;
            //d.next=e;
            //display(a);
            linkedlist ll=new linkedlist();
            Boolean x=ll.hasCyclic(a);
            System.out.println(x);

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
