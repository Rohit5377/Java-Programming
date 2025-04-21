// Maximum twin sum means taking the sum of 1st and last element then comparing with sum of 2nd and
//2nd last element and return the highest sum and this is only happen when the size of linked list is even.
// Example:- in this program 1+1, 7+2,3+3 is happening and the maximum sum is 9 of 7+2. so it returns 9.

class MaximunTwinSum {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next = null;
            }
        }
        public static class linkedList{
            public static int MaxSum(Node head){
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
                int sum=0;
                int max=Integer.MIN_VALUE;
                while(temp2!=null){
                    sum=temp1.data+temp2.data;
                    if(sum>max){
                        max=sum;
                    }
                    temp1=temp1.next;
                    temp2=temp2.next;
                }

                return max;
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
            Node b= new Node(7);
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
            int z=ll.MaxSum(a);
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
