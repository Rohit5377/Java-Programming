class TraverseLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a= new Node(5);
        Node b= new Node(6);
        Node c= new Node(3);
        Node d= new Node(9);
        a.next=b;// a ->b c
        b.next=c;// a ->b ->c
        c.next=d;// a ->b ->c -> d
        display(a);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data); //1.temp.next=5 2.temp.next.next=6, 3.temp.next.next.next=3.....
            temp=temp.next;
        }
    }

}
