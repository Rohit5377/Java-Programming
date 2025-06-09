 class SymmetryTree {
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
        public boolean isSymmetric(TreeNode root) {
            invertTree(root.left);
            return isSame(root.left,root.right);
        }
        public boolean isSame(TreeNode p,TreeNode q){
            if(p==null && q==null) return true;
            if(p==null || q==null) return false;
            if(p.val!=q.val) return false;
            return isSame(p.left,q.left) && isSame(p.right,q.right);
        }

        public void invertTree(TreeNode root){
            if(root==null) return;
            TreeNode l=root.left;
            TreeNode r=root.right;
            root.left=r;
            root.right=l;
            invertTree(root.left);
            invertTree(root.right);
            return;
        }
    }
}
