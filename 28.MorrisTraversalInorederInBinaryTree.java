import java.util.ArrayList;
import java.util.List;

class MorrisTraversalInorederInBinaryTree {
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
        public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> list=new ArrayList<>();
            if(root==null) return list;
            TreeNode curr=root;
            while(curr!=null){
                if(curr.left!=null){
                    TreeNode pred=curr.left;
                    while(pred.right!=null && pred.right.val!=curr.val) pred=pred.right;
                    if(pred.right==null){
                        pred.right=curr;
                        curr=curr.left;
                    }else{
                        list.add(curr.val);
                        curr=curr.right;
                        pred.right=null;
                    }
                }else{
                    list.add(curr.val);
                    curr=curr.right;
                }
            }
            return list;
        }
    }
}
