class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int left=0;
        int right=0;
        for(int i=0;i<mat.length;i++){
            left+=mat[i][i];
            if(i==mat.length-i-1) continue;
            right+=mat[i][mat.length-1-i];
        }
        sum=left+right;
        return sum;
    }
}