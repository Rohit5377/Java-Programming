class CretingLinkedList {

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

        a.next=b;// a ->b c
        b.next=c;// a ->b ->c
        System.out.println(a.data);
        System.out.println(a);
        System.out.println(a.next);
        System.out.println(b.data);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c.data);
        System.out.println(c);
        System.out.println(c.next);


    }
}
