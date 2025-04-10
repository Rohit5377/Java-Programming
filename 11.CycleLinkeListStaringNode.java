class CycleLinkeListStaringNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedlist {

        public Node startingNode(Node head) {
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                return head;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) {
                    break;
                }
            }
            Node temp = head;
            while (temp != slow) {
                temp = temp.next;
                slow = slow.next;
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(3);
        Node d = new Node(9);
        // Node e= new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // cyclic linked list formed here
        // d.next=e;
        // display(a);
        linkedlist ll = new linkedlist();
        Node x = ll.startingNode(a);
        System.out.println(x.data);

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
