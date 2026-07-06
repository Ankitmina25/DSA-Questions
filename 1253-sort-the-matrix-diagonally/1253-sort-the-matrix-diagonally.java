class Solution {
    public int[][] diagonalSort(int[][] mat) {
        ArrayList<Integer> list= new ArrayList<>();
        int m= mat.length;
        int n=mat[0].length;
        for (int i=0;i<n;i++){
            int row=0;
            int col=i;
            while(row<m && col<n){
                list.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(list); 
            row=0;
            col=i;
            int idx=0;
            while(row<m && col<n){
                mat[row][col]=list.get(idx);
                row++;
                col++;
                idx++;
            }
            list.clear();
        }
        for (int i = 1; i < m; i++) {
            int row = i;
            int col = 0;
            while (row < m && col < n) {
                list.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(list);
            row = i;
            col = 0;
            int idx = 0;
            while (row < m && col < n) {
                mat[row][col] = list.get(idx);
                row++;
                col++;
                idx++;
            }
            list.clear();
        }
        return mat;
    }
}