class PrintElementsInSprialForm {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row=arr.length, col=arr[0].length;
        int totalElement=0;
        int topRow=0, rightCol=arr[0].length-1, bottomRow=arr.length-1, leftCol=0;
        while(totalElement< row*col){
            for(int j=leftCol;j<=rightCol && totalElement< row*col;j++){
                System.out.println(arr[topRow][j]);
                totalElement++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow && totalElement< row*col;i++){
                System.out.println(arr[i][rightCol]);
                totalElement++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol && totalElement< row*col;j--){
                System.out.println(arr[bottomRow][j]);
                totalElement++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && totalElement< row*col;i--){
                System.out.println(arr[i][leftCol]);
                totalElement++;
            }
            leftCol++;
        }
    }
}

