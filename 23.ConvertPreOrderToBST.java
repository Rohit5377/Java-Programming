class ConvertPreOrderToBST {
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
        public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root=new TreeNode(preorder[0]);
            int n=preorder.length;
            if(n<=1) return root;
            for(int i=1;i<n;i++){
                helper(root,preorder[i]);
            }
            return root;
        }
        public void helper(TreeNode root, int x){
            if(x<root.val){
                if(root.left==null){
                    TreeNode temp=new TreeNode(x);
                    root.left=temp;
                    return;
                }else helper(root.left,x);
            }else{
                if(root.right==null){
                    TreeNode temp=new TreeNode(x);
                    root.right=temp;
                    return;
                }else{
                    helper(root.right,x);
                }
            }
            return;
        }
    }
}
