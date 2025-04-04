class IntersectionOfTwoLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static class linkedList {
            public static Node InterSectionNode(Node headA, Node headB) {
                Node tempA = headA;
                Node tempB = headB;
                int lengthA = 0;
                while (tempA != null) {
                    lengthA++;
                    tempA = tempA.next;
                }
                int lengthB = 0;
                while (tempB != null) {
                    lengthB++;
                    tempB = tempB.next;
                }
                tempA = headA;
                tempB = headB;
                if (lengthA > lengthB) {
                    int step = lengthA - lengthB;
                    for (int i = 1; i <= step; i++) {
                        tempA = tempA.next;
                    }
                } else {
                    int step = lengthB - lengthA;
                    for (int i = 1; i <= step; i++) {
                        tempB = tempB.next;
                    }

                }
                while (tempA != tempB) {
                    tempA = tempA.next;
                    tempB = tempB.next;
                }
                return tempA;
            }
        }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(6);
            Node c = new Node(3);
            Node d = new Node(9);
            Node e = new Node(2);
            Node f = new Node(7);
        //second list merge with first list at point d
            Node p = new Node(1);
            Node q = new Node(8);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            p.next=q;
            q.next=d;

            display(a);
            display(p);
            linkedList ll = new linkedList();
            System.out.println(ll.InterSectionNode(a,p).data);

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
}
