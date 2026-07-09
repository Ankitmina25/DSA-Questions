class Solution {
    public boolean helper(char[][] board, String word,int i,int j,int idx, boolean[][] visited){
        if(idx==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(idx)) return false;
        visited[i][j]= true;
                if(helper(board,word,i-1,j,idx+1,visited)) return true;
                if(helper(board,word,i+1,j,idx+1,visited)) return true;
                if(helper(board,word,i,j-1,idx+1,visited)) return true;
                if(helper(board,word,i,j+1,idx+1,visited)) return true;
                visited[i][j]=false;
                return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean [][] visited= new boolean [board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(board,word,i,j,0,visited)) return true;
            }
        }
        return false;
    }
}