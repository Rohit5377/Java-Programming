class CopyListWithRandomPointer {
        public static class Node{
            int data;
            Node next;
            Node random=null;
            Node(int data){
                this.data =data;
                this.next = null;
                this.random=null;
            }
        }
        public static class linkedList{
            public static Node copy(Node head) {
                Node head2 = new Node(0);
                Node temp1 = head;
                Node temp2=head2;

                //making deep copy of linked list
                while(temp1!=null){
                    Node a=new Node(temp1.data);
                    temp2.next=a;
                    temp2=a;
                    temp1=temp1.next;
                }

                // making alternate connection between both lists
                head2=head2.next;
                temp1=head;
                temp2=head2;
                Node temp= new Node(0);
                while(temp1!=null){
                    temp.next=temp1;
                    temp1=temp1.next;
                    temp=temp.next;

                    temp.next=temp2;
                    temp2=temp2.next;
                    temp=temp.next;
                }
                temp2=head2;
                temp1=head;

                //making connections of random
                while(temp1!=null){
                    if(temp1.random==null){
                        temp2.random=null;
                    }
                    else {
                        temp2.random = temp1.random.next;
                    }
                    temp1=temp2.next;
                    if(temp1!=null) temp2=temp1.next;
                }

                //Separating both linked lists
                temp1=head;
                temp2=head2;
                while(temp1!=null){
                    temp1.next=temp2.next;
                    temp1=temp1.next;
                    if(temp1==null) break;
                    temp2.next=temp1.next;
                    if(temp2.next==null) break;
                    temp2=temp2.next;
                }
                return head2;
            }

        }

        public static void main(String[] args) {
            Node a= new Node(7);
            Node b= new Node(13);
            Node c= new Node(11);
            Node d= new Node(10);
            Node e= new Node(1);

            a.next=b;
            a.random=null;
            b.next=c;
            b.random=a;
            c.next=d;
            c.random=e;
            d.next=e;
            d.random=c;
            e.random=a;


            display(a);
            display(linkedList.copy(a));
            System.out.println();


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
