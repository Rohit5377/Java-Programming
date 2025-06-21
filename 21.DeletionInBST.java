class DeletionInBST {

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
        public TreeNode deleteNode(TreeNode root, int key) {
            TreeNode temp=new TreeNode(Integer.MAX_VALUE);
            temp.left=root;
            delete(temp,key);
            return temp.left;
        }
        public void delete(TreeNode root, int target){
            if(root.left==null && root.right==null) return;
            if(root.val>target){
                if(root.left.left==null && root.left.right==null&& root.left.val==target){
                    root.left=null;
                }else if(root.left.val==target && (root.left.left==null || root.left.right==null)){
                    if(root.left.left==null) root.left=root.left.right;
                    else root.left=root.left.left;
                }else if(root.left.val==target){
                    TreeNode pred=root.left.left;
                    while(pred.right!=null) pred=pred.right;
                    delete(root,pred.val);
                    pred.left=root.left.left;
                    pred.right=root.left.right;
                    root.left=pred;
                }else{
                    delete(root.left,target);
                }
            }else{
                if(root.right.right==null && root.right.left==null && root.right.val==target){
                    root.right=null;
                }else if(root.right.val==target && (root.right.left==null || root.right.right==null)){
                    if(root.right.left==null) root.right=root.right.right;
                    else root.right=root.right.left;
                }else if(root.right.val==target){
                    TreeNode pred=root.right.left;
                    while(pred.right!=null) pred=pred.right;
                    delete(root,pred.val);
                    pred.left=root.right.left;
                    pred.right=root.right.right;
                    root.right=pred;
                }
                else{
                    delete(root.right,target);
                }
            }
        }
    }
}
