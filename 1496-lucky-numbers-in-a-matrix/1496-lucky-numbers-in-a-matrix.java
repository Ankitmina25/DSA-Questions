class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
          
            List<Integer> mp=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int miny=matrix[i][0];
            int maxy = Integer.MIN_VALUE;
            int col=0;
            for(int j=1;j<matrix[0].length;j++){
                if(miny>matrix[i][j]){
                        miny=matrix[i][j];
                        col=j;
                }
            }
                for(int k=0;k<matrix.length;k++){
                    maxy=Math.max(maxy,matrix[k][col]);

                }
                if(miny==maxy){
                    mp.add(miny);
                }
        }
        return mp;
    }
}