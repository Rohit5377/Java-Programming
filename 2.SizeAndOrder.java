class SizeAndOrder {
    public  static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    //print size
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }


    //print height
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }


    //print maximum
    public static int max(Node root){
        if(root==null){
            return 0;
        }
        int a=max(root.left);
        int b=max(root.right);
        return Math.max(root.val,Math.max(a,b));
    }


    //print sum
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }


    //print preorder  NODE LEFT RIGHT
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    //print inorder  LEFT NODE RIGHT
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }


    //print postorder  LEFT RIGHT NODE
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+ " ");
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
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(height(root));
        System.out.println(max(root));
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
