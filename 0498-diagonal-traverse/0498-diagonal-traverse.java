class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row=0;
        int col=0;
        int r=mat.length;
        int c=mat[0].length;
        boolean up=true;
        int [] arr= new int[r*c];
        for(int i=0;i<r*c;i++){
            arr[i]=mat[row][col];
            if(up){
                if(col==mat[0].length-1){
                    row++;
                       up=false;
                }
             
                else if(row==0){
                    col++;
                          up=false;
                }
          
                else{
                    row--;
                    col++;
                }
            }else{
                if(row==mat.length-1){
                    col++;
                      up=true;
                }
              
                else if(col==0){
                    row++;
                    up=true;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return arr;

    }
}