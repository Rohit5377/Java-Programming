

//WAP to find two numbers whose sum is equal to target sum and this is happened only for increasing order sorted doublyLinkedList

class SumOfTwoDoublyLinkedList {
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
        public class  DoublyLinkedList {
            public static void TargetSum(Node head,int t){
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                Node tail=temp;
                temp=head;
                while(temp!=tail){
                    if((temp.data+tail.data)==t){
                        System.out.println(temp.data+" + "+ tail.data+" = "+ t);
                        break;
                    }
                    else if(temp.data+tail.data>t){
                        tail=tail.prev;
                    }
                    else{
                        temp=temp.next;
                    }
                }
            }

        }

        public static void main(String[] args) {
            Node a= new Node(3);
            Node b= new Node(5);
            Node c= new Node(6);
            Node d= new Node(8);
            Node e= new Node(9);
            a.next=b;
            b.prev=a;
            b.next=c;
            c.prev=b;
            c.next=d;
            d.prev=c;
            d.next=e;
            e.prev=d;
            display(a);
            DoublyLinkedList.TargetSum(a,15);

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
