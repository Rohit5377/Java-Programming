import java.util.ArrayList;
import java.util.List;

class TreePathSumII {

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
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> list1=new ArrayList<>();
            List<Integer> list=new ArrayList<>();
            helper(root,targetSum,list,list1);
            return list1;
        }

        public void helper(TreeNode root, int targetSum, List<Integer> list,List<List<Integer>> list1){
            if(root==null) return;
            if(root.left==null && root.right==null){
                list.add(root.val);
                if(root.val==targetSum){
                    List<Integer> l=new ArrayList<>();
                    for(int i=0;i<list.size();i++){
                        l.add(list.get(i));
                    }
                    list1.add(l);
                }
                list.remove(list.size()-1);
                return;
            }
            list.add(root.val);
            helper(root.left, targetSum-root.val,list,list1);
            helper(root.right, targetSum-root.val,list,list1);
            list.remove(list.size()-1);
            return;
        }
    }
}
