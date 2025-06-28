import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class AverageOfLevelsInBinaryTree {
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
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> list=new ArrayList<>();
            if(root==null) return list;
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            while(q.size()>0){
                Double sum=0.0;
                int n=q.size();
                for(int i=0;i<n;i++){
                    TreeNode temp=q.poll();
                    sum+=temp.val;
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);
                }
                list.add(sum/n);
            }
            return list;
        }
    }
}
