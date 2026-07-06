class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int r=mat.length;
        int c= mat[0].length;
        int row=0;
        int col=0;
        boolean up=true;
        int [] arr= new int[r*c];
        for (int i=0;i<r*c;i++){
            arr[i]=mat[row][col];
            if(up){
                if(col==c-1){
                    row++;
                    up=false;
                }
                else if(row==0){
                    col++;
                    up=false;
                }else {
                    row--;
                    col++;
                }
            }else{
                if(row==r-1){
                    col++;
                    up=true;
                }else if(col==0){
                    row++;
                    up=true;
                }else {
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}