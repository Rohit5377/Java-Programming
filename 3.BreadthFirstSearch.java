import java.util.LinkedList;
import java.util.Queue;

class BreadthFirstSearch {
    public  static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    //print height
    public static int height(Node root){
        if(root==null || root.left==null ||root.right==null){
            return 0;
        }
        return 1+height(root.left)+height(root.right);
    }

    public static void BFSprint1(Node root,int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        BFSprint1(root.left,n-1);
        BFSprint1(root.right,n-1);
    }


    public static void BFSprint2(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        b.left=e;

        //Recursive method to print elements in BFS order
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            BFSprint1(root,i);
            System.out.println();
        }
        System.out.println();

        //Iterative way of printing elements in BFS order using queue
        BFSprint2(root);
    }
}
