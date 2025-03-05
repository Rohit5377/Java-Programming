public class WaysInMatrix {
    public static void main(String[] args) {
        System.out.println(path(1,1,3,3
        ));
    }
    public static int path(int r, int c, int er, int ec){
        if(r>er || c>ec){
            return 0;
        }
        if(r==er && c==ec){
            return 1;
        }
        return path(r,c+1,er,ec) + path(r+1,c,er,ec);
    }
}
