class DoublyLinkelistCreating {
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
            displayrev(e);
            displayRandom(c);
        }
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    public static void displayrev(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    // this will the complete list with randon node or middle node
    public static void displayRandom(Node random){
            Node temp = random;
            while(temp.prev!=null){
                temp=temp.prev;
            }
            //  temp is at head
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

}
