class InsertAtLastNode {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        //Insert element at Starting
        void insertAtHead(int val){
            Node newElement= new Node(val);
            if(head==null){
                head = newElement;
                tail=newElement;
            }
            else{
                newElement.next=head;
                head=newElement;
            }
        }

        //Insert element at End
        void insertAtEnd(int val){
            Node newElement= new Node(val);
             if(head==null){
                 head = newElement;
             }
             else{
                 tail.next=newElement;
             }
             tail=newElement;
        }

        //Insert elemnt at specific index
        void insetrAtMid(int idx, int val){
            Node newElement=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            newElement.next=temp.next;
            temp.next=newElement;
        }

        //Delete element from any specific index
        void deleteAt(int idx){
            Node temp=head;
            for (int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        //Get value of any Node
        int getElement(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        //Print the linked list
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        //Calculated size of linked list
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(3);
        ll.insertAtHead(9);
        ll.insetrAtMid(2,6);
        ll.insetrAtMid(0,2);
        ll.insetrAtMid(6,7);
        ll.display();

        System.out.println("\n"+ll.getElement(2));
        ll.deleteAt(2);
        ll.display();
        System.out.println("\nSize of Linked List = "+ll.size());
    }
}
