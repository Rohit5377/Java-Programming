public class blockMaze {
    public static void main(String[] args) {
        int i=3,j=4;
        int[][] isVisited={
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        path(0,0,i-1,j-1,"",isVisited);
    }

    public static void path(int sr,int sc,int r,int c,String str, int[][] isVisited){
        if(sr>r || sc>c) return;
        if(sr<0 || sc<0) return;
        if(isVisited[sr][sc]==0) return; //block
        if(isVisited[sr][sc]==-1) return; // already visited
        if(sr==r && sc==c){
            System.out.println(str);
            return;
        }
        isVisited[sr][sc]=-1;
        path(sr,sc+1,r,c,str+"R",isVisited);
        path(sr+1,sc,r,c,str+"D",isVisited);
        path(sr,sc-1,r,c,str+"L",isVisited);
        path(sr-1,sc,r,c,str+"U",isVisited);
        isVisited[sr][sc]=1;
    }
}
