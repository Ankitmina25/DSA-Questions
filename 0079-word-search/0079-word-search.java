class Solution {
    public boolean helper(char[][] board,String word,boolean[][] visit,int row,int col,int idx){
        if(idx==word.length()) return true;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!=word.charAt(idx) || visit[row][col]) return false;
        visit[row][col]=true;
        if(helper(board,word,visit,row,col+1,idx+1)) return true;
        if(helper(board,word,visit,row+1,col,idx+1)) return true;
        if(helper(board,word,visit,row,col-1,idx+1)) return true;
        if(helper(board,word,visit,row-1,col,idx+1)) return true;
        visit[row][col]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] visit= new boolean[board.length][board[0].length];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(helper(board,word,visit,row,col,0)) return true;
            }
        }
       return false;
    }
}