class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    char num='1';
                    while(num<='9')
                    {
                        if(valid(board,i,j,num))
                        {
                            board[i][j]=num;
                            if(solve(board))
                                return true;
                            else
                                board[i][j]='.';
                        }
                        num++;
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean valid(char[][] board,int a,int b,char c)
    {
        for(int i=0;i<9;i++)
        {
            if(board[a][i]==c)
                return false;
        }
        for(int i=0;i<9;i++)
        {
            if(board[i][b]==c)
                return false;
        }
        int row=a/3*3;
        int col=b/3*3;
        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                if(board[i][j]==c)
                    return false;
            }
        }
        return true;
    }
}