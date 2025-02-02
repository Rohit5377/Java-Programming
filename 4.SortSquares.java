class SortSquares {
    public static void main(String[] args) {
        int[] arr={-10,-3,-2,1,4,5};
        int n=arr.length;
        int[] ans=new int[n];
        int i=0,j=n-1;
        int k=n-1;
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k--]=arr[i]*arr[i];
                i++;
            }else{
                ans[k--]=arr[j]*arr[j];
                j--;
            }
        }
        for(int p=0;p<ans.length;p++){
            System.out.print(ans[p]+" ");
        }
    }
}
