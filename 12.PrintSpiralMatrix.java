class PrintSpiralMatrix {
    public static void main(String[] args) {
        int n=4;
        int[][] arr=new int[n][n];
        int curr=1;
        int topRow=0, rightCol=n-1, bottomRow=n-1, leftCol=0;
        while(curr<=n*n){
            for(int j=leftCol;j<=rightCol && curr<= n*n;j++){
                arr[topRow][j]=curr;
                curr++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow && curr<= n*n;i++){
                arr[i][rightCol]=curr;
                curr++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol && curr<= n*n;j--){
                arr[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && curr<= n*n;i--){
                arr[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
