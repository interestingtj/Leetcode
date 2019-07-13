class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(!row(board)||!column(board)||!cube(board))
            return false;
        return true;
        
    }
    private boolean row(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            HashMap<Character,Integer> map=new HashMap<Character,Integer>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                    continue;
                else if(map.containsKey(board[i][j]))
                    return false;
                else
                    map.put(board[i][j],0);
            }
        }
        return true;
    }
    private boolean column(char[][] board)
    {
        for(int j=0;j<9;j++)
        {
            HashMap<Character,Integer> map=new HashMap<Character,Integer>();
            for(int i=0;i<9;i++)
            {
                if(board[i][j]=='.')
                    continue;
                else if(map.containsKey(board[i][j]))
                    return false;
                else
                    map.put(board[i][j],0);
            }
        }
        return true;
    }
    private boolean cube(char[][] board)
    {
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                HashMap<Character,Integer> map=new HashMap<Character,Integer>();
                for(int ii=i;ii<i+3;ii++)
                {
                    
                    for(int jj=j;jj<j+3;jj++)
                    {
                        if(board[ii][jj]=='.')
                            continue;
                        else if(map.containsKey(board[ii][jj]))
                            return false;
                        else
                            map.put(board[ii][jj],0);
                    }
                }
            }
        }
        return true;
    }
    
}