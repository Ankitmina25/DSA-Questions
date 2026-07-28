class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int total=r*c;
        int [][] arr= new int [r][c];
        if(mat.length * mat[0].length!=total) return mat;
        for(int i=0;i<total;i++){
            int oldrow=i/mat[0].length;
            int oldcol=i%mat[0].length;
            int newrow=i/arr[0].length;
            int newcol=i%arr[0].length;
            arr[newrow][newcol]=mat[oldrow][oldcol];
        }
        return arr;
    }
}