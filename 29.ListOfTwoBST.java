import java.util.ArrayList;
import java.util.List;

class ListOfTwoBST {

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
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            ArrayList<Integer> list1=new ArrayList<>();
            ArrayList<Integer> list2=new ArrayList<>();
            ArrayList<Integer> list3=new ArrayList<>();
            TreeNode curr=root1;
            while(curr!=null){
                if(curr.left!=null){
                    TreeNode pred=curr.left;
                    while(pred.right!=null && pred.right.val!=curr.val) pred=pred.right;
                    if(pred.right==null){
                        pred.right=curr;
                        curr=curr.left;
                    }else{
                        list1.add(curr.val);
                        curr=curr.right;
                        pred.right=null;
                    }
                }else{
                    list1.add(curr.val);
                    curr=curr.right;
                }
            }
            curr=root2;
            while(curr!=null){
                if(curr.left!=null){
                    TreeNode pred=curr.left;
                    while(pred.right!=null && pred.right.val!=curr.val) pred=pred.right;
                    if(pred.right==null){
                        pred.right=curr;
                        curr=curr.left;
                    }else{
                        list2.add(curr.val);
                        curr=curr.right;
                        pred.right=null;
                    }
                }else{
                    list2.add(curr.val);
                    curr=curr.right;
                }
            }
            int i=0,j=0;
            while(i<list1.size() && j<list2.size()){
                if(list1.get(i)<=list2.get(j)){
                    list3.add(list1.get(i));
                    i++;
                }else{
                    list3.add(list2.get(j));
                    j++;
                }
            }
            while(i<list1.size()){
                list3.add(list1.get(i));
                i++;
            }
            while(j<list2.size()){
                list3.add(list2.get(j));
                j++;
            }
            return list3;
        }
    }
}
