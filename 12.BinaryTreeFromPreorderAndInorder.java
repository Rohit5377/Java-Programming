class BinaryTreeFromPreorderAndInorder {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n=preorder.length;
            return helper(preorder,0,n-1,inorder,0,n-1);
        }

        public TreeNode helper(int[] preorder,int pl,int phi,int[] inorder,int il,int ihi){
            if(pl>phi) return null;
            TreeNode root=new TreeNode(preorder[pl]);
            int i=il;
            while(inorder[i]!=preorder[pl]) i++;
            int leftSize=i-il;
            root.val=preorder[pl];
            root.left=helper(preorder,pl+1,pl+leftSize,inorder,il,i-1);
            root.right=helper(preorder,pl+leftSize+1,phi,inorder,i+1,ihi);
            return root;
        }
    }
}
