class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int left=0;
        int right=nums[0].length-1;
        int top=0;
        int bottom=nums.length-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(nums[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(nums[i][right]); 
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(nums[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(nums[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}