class MorrisTraversalFlatenBinaryTree {

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
        public void flatten(TreeNode root) {
            if(root==null) return;
            TreeNode curr=root;
            while(curr!=null){
                TreeNode pred=curr.left;
                if(pred!=null){
                    while(pred.right!=null){
                        pred=pred.right;
                    }
                    pred.right=curr.right;
                    curr.right=curr.left;
                    curr.left=null;
                }
                curr=curr.right;
            }
        }
    }
}
