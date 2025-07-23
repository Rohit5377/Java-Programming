//Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
//
//Note that it is the kth smallest element in the sorted order, not the kth distinct element.
//
//You must find a solution with a memory complexity better than O(n2).
//
//
//
//Example 1:
//
//Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
//Output: 13
//Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
//Example 2:
//
//Input: matrix = [[-5]], k = 1
//Output: -5
//
//
//Constraints:
//
//n == matrix.length == matrix[i].length
//1 <= n <= 300
//        -109 <= matrix[i][j] <= 109
//All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
//        1 <= k <= n2

class KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int st=matrix[0][0];
        int end=matrix[n-1][m-1];
        while(st<=end){
            int mid=st+(end-st)/2;
            int lessEle=findLessEle(matrix,mid);
            if(lessEle<k){ // or if(lessEle<=k-1){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return st;
    }
    public int findLessEle(int[][] matrix, int ele){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            int st=0;
            int end=matrix[i].length-1;
            while(st<=end){
                int mid=st+(end-st)/2;
                if(matrix[i][mid]<=ele){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
            count+=st;
        }
        return count;
    }
}
