class PalindromeBestMethodLinkedList {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{
            public static Boolean Palindrome(Node head){
                Node slow=head;
                Node fast=head;
                while(fast.next!=null&& fast.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                Node temp=reverse(slow.next);
                slow.next=temp;
                Node temp1=head;
                Node temp2=temp;
                while(temp2!=null){
                    if(temp1.data!=temp2.data){
                        return  false;
                    }
                    temp1=temp1.next;
                    temp2=temp2.next;
                }

                return true;
            }


            public static Node reverse(Node head){
                Node prev= null;
                Node cur=head;
                Node agla=null;
                while(cur!=null){
                    agla=cur.next;
                    cur.next=prev;
                    prev=cur;
                    cur=agla;
                }

                return prev;
            }
        }

        public static void main(String[] args) {
            Node a= new Node(1);
            Node b= new Node(2);
            Node c= new Node(3);
            Node d= new Node(3);
            Node e= new Node(2);
            Node f= new Node(1);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;

            display(a);
            linkedList ll=new linkedList();
            Boolean z=ll.Palindrome(a);
            System.out.println(z);

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
