class ConvertlistToBST {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


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
        public TreeNode sortedListToBST(ListNode head) {
            int n=0;
            ListNode temp=head;
            while(temp!=null){
                temp=temp.next;
                n++;
            }
            int[] arr= new int[n];
            temp=head;
            int i=0;
            while(temp!=null){
                arr[i++]=temp.val;
                temp=temp.next;
            }
            return helper(arr,0,n-1);
        }
        public TreeNode helper(int[] arr,int lo, int hi){
            if(lo>hi){
                return null;
            }
            int mid=lo+(hi-lo)/2;
            TreeNode root=new TreeNode(arr[mid]);
            root.left=helper(arr,lo,mid-1);
            root.right=helper(arr,mid+1,hi);
            return root;
        }
    }
}
