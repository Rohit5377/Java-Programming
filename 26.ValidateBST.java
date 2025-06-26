import java.util.ArrayList;

class ValidateBST {
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
        public boolean isValidBST(TreeNode root) {
            ArrayList<Integer> list=new ArrayList<>();
            helper(root,list);
            for(int i=1;i<list.size();i++){
                if(list.get(i)<=list.get(i-1)) return false;
            }
            return true;
        }

        public void helper(TreeNode root,ArrayList<Integer> list){
            if(root==null) return;
            helper(root.left,list);
            list.add(root.val);
            helper(root.right,list);
        }
    }
}
