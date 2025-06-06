import java.util.ArrayList;
import java.util.List;

class TreePathRootToLeafNode {
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> list=new ArrayList<>();
            helper(root,list,"");
            return list;
        }

        public void helper(TreeNode root,List<String> list,String str){
            if(root==null) return;
            if(root.left==null && root.right==null){
                str +=root.val;
                list.add(str);
                return;
            }
            helper(root.left,list,str+root.val+"->");
            helper(root.right,list,str+root.val+"->");
        }
    }
}
