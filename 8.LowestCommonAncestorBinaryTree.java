 class LowestCommonAncestorBinaryTree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(p==root || q==root ) return root;
            if(p==q) return p;
            if((contains(root.left,p)&&contains(root.right,q)) ||(!contains(root.left,p)&&!contains(root.right,q))) return root;
            if(contains(root.left,p)) return lowestCommonAncestor(root.left,p,q);
            if(contains(root.right,q))return lowestCommonAncestor(root.right,p,q);
            return root;
        }
        public boolean contains(TreeNode root,TreeNode x){
            if(root==null){
                return false;
            }
            if(root==x) return true;
            return contains(root.left,x) || contains(root.right,x);
        }
    }
}
