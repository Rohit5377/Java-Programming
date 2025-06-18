import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class AmountOfTimeForBinaryTreeToBeInfected {

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
        public int amountOfTime(TreeNode root, int start) {
            HashMap<TreeNode,TreeNode> mp=new HashMap<>();
            HashMap<TreeNode,Integer> mp1=new HashMap<>();
            parent(root,mp);
            int max=-1;
            TreeNode inf= infected(root, start);
            Queue<TreeNode> q=new LinkedList<>();
            q.add(inf);
            mp1.put(inf,0);
            while(q.size()>0){
                TreeNode currNode=q.poll();
                if(!mp1.containsKey(currNode.left) && currNode.left!=null){
                    mp1.put(currNode.left,mp1.get(currNode)+1);
                    q.add(currNode.left);
                }
                if(!mp1.containsKey(currNode.right) && currNode.right!=null){
                    mp1.put(currNode.right,mp1.get(currNode)+1);
                    q.add(currNode.right);
                }
                if(mp.containsKey(currNode) && !mp1.containsKey(mp.get(currNode))){
                    mp1.put(mp.get(currNode),mp1.get(currNode)+1);
                    q.add(mp.get(currNode));
                }
            }
            for(Integer x: mp1.values()){
                max=Math.max(max,x);
            }
            return max;
        }
        public TreeNode infected(TreeNode root,int start){
            if(root==null) return null;
            if(root.val==start) return root;
            TreeNode left= infected(root.left,start);
            TreeNode right= infected(root.right,start);
            if(left!=null) return left;
            else return right;
        }

        public void parent(TreeNode root,HashMap<TreeNode,TreeNode> mp){
            if(root==null) return;
            if(root.left!=null) mp.put(root.left,root);
            if(root.right!=null) mp.put(root.right,root);
            parent(root.left,mp);
            parent(root.right,mp);
        }
    }
}
