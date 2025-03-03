public class maze {
    public static void main(String[] args) {
        int i=3,j=3;
        boolean[][] isVisited=new boolean[i][j];
        path(0,0,i-1,j-1,"",isVisited);
    }

    public static void path(int sr,int sc,int r,int c,String str, boolean[][] isVisited){
        if(sr>r || sc>c) return;
        if(sr<0 || sc<0) return;
        if(isVisited[sr][sc]) return;
        if(sr==r && sc==c){
            System.out.println(str);
            return;
        }
        isVisited[sr][sc]=true;
        path(sr,sc+1,r,c,str+"R",isVisited);
        path(sr+1,sc,r,c,str+"D",isVisited);
        path(sr,sc-1,r,c,str+"L",isVisited);
        path(sr-1,sc,r,c,str+"U",isVisited);
        isVisited[sr][sc]=false;
    }

}
