import java.util.ArrayList;
import java.util.List;

class ZigZagBinaryTreePrintLikeSnake {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> list=new ArrayList<>();
            if(root==null) return list;
            int level=height(root)+1;
            for(int i=1;i<=level;i++){
                List<Integer> list1=new ArrayList<>();
                if(i%2==0){
                    backward(root,list1,i);
                    list.add(list1);
                }else{
                    forward(root,list1,i);
                    list.add(list1);
                }
            }
            return list;
        }
        public int height(TreeNode root){
            if(root==null || (root.left==null&& root.right==null)) return 0;
            return 1+Math.max(height(root.left),height(root.right));
        }
        public List<Integer> forward(TreeNode root,List<Integer> list,int i){
            if(root==null) return list;
            if(i==1) list.add(root.val);
            forward(root.left,list,i-1);
            forward(root.right,list,i-1);
            return list;
        }
        public List<Integer> backward(TreeNode root,List<Integer> list,int i){
            if(root==null) return list;
            if(i==1) list.add(root.val);
            backward(root.right,list,i-1);
            backward(root.left,list,i-1);
            return list;
        }
    }
}
