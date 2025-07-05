class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        boolean res=false;
        boolean[][] a=new boolean[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]==word.charAt(0))
                    res=res||re(board,word,i,j,0,a);
            }
        }
        return res;
    }
    public boolean re(char[][] board,String word,int x,int y,int start,boolean[][] a){
        if(start==word.length())
            return true;
        if(x<0||x>board.length-1||y<0||y>board[0].length-1||a[x][y]||word.charAt(start)!=board[x][y])
            return false;
        else
        {
            a[x][y]=true;
            boolean res=re(board,word,x+1,y,start+1,a)||re(board,word,x-1,y,start+1,a)||re(board,word,x,y+1,start+1,a)||re(board,word,x,y-1,start+1,a);
            a[x][y]=false;
            return res;
        }
        
    }
}