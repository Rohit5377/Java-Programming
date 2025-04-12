class OddEvenLinkedListByNodeIndex {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList {
            public static Node merge(Node head){
                Node temp=head;
                Node tempo=new Node(0);
                Node tempe=new Node(0);
                Node temp1=tempo;
                Node temp2=tempe;
                while(temp!=null){
                    temp1.next=temp;
                    temp=temp.next;
                    temp1=temp1.next;

                    temp2.next=temp;
                    if(temp==null){
                        break;
                    }
                    temp=temp.next;
                    temp2=temp2.next;
                }
                temp1.next=tempe.next;

                return tempo.next;
            }





            // in starting list of odd numbers is made and at last we connect a list of even number
//            public static Node merge(Node head) {
//                Node temp1=head;
//                Node temp2=head.next;
//                Node temp3=temp2;
//                while(temp1.next!=null&&temp2.next!=null){
//                    temp1.next=temp2.next;
//                    temp1=temp2.next;
//                    temp2.next=temp1.next;
//                    temp2=temp1.next;
//                }
//                if(temp1.next==null) {
//                    temp1.next = temp3;
//                }
//                else{
//                    temp2.next = temp3;
//                }
//                return head;
//            }

            public static void main(String[] args) {
                Node a = new Node(3);
                Node b = new Node(2);
                Node c = new Node(5);
                Node d = new Node(7);
                Node e = new Node(8);

                a.next = b;
                b.next = c;
                c.next = d;
                d.next = e;


                display(a);
                display(linkedList.merge(a));
                //display(a);

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
