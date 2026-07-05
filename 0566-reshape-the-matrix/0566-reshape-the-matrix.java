class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int total= r*c;
        int [][] arr= new int[r][c];
        if(mat.length*mat[0].length!= r*c) return mat;
        for(int k=0;k<total;k++){
            int oldRow=k/mat[0].length;
            int oldCol= k%mat[0].length;
            int newRow= k/c;
            int newCol=k%c;
            arr[newRow][newCol]= mat[oldRow][oldCol];
        }
        return arr;
    }
}