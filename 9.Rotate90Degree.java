class Rotate90Degree {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //making transpose of matrix
        int col=arr[0].length;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //swaping numbers of row
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<col/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][col-j-1];
                arr[i][col-j-1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
