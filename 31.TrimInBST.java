class TrimInBST {
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
        public TreeNode trimBST(TreeNode root, int low, int high) {
            TreeNode temp=new TreeNode(Integer.MAX_VALUE);
            temp.left=root;
            trim(temp,low,high);
            return temp.left;
        }

        public void trim(TreeNode root, int low, int high){
            if(root==null) return;
            while(root.left!=null && (root.left.val<low || root.left.val>high)){
                if(root.left.val<low){
                    root.left=root.left.right;
                }else if(root.left.val>high){
                    root.left=root.left.left;
                }

            }
            while(root.right!=null && (root.right.val>high|| root.right.val<low)){
                if(root.right.val>high){
                    root.right=root.right.left;
                }else if(root.right.val<low){
                    root.right=root.right.right;
                }

            }
            trim(root.left,low,high);
            trim(root.right,low,high);
        }
    }
}
