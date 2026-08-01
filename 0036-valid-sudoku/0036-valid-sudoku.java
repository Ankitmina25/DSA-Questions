class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> [] row= new HashSet[9];
        HashSet<Character> [] col= new HashSet[9];
        HashSet<Character> [] box= new HashSet[9];
        for(int i=0;i<board.length;i++){
            row[i]= new HashSet<>();
            col[i]= new HashSet<>();
            box[i]=new HashSet<>();
        }

        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char ch= board[i][j];
                if(ch== '.') continue;

                if(row[i].contains(ch)) return false;
                row[i].add(ch);

                if(col[j].contains(ch)) return false;
                col[j].add(ch);
                int boardIdx= 3*(i/3)+(j/3);
                if(box[boardIdx].contains(ch)) return false;
                box[boardIdx].add(ch);
            }
        }
        return true;
    }
}