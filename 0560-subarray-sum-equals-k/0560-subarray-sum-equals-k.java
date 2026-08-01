class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        map.put(0,map.getOrDefault(0,0)+1);
        while(right<nums.length){
            sum+=nums[right];
            int find= sum-k;
            if(map.containsKey(find)){
                count+=map.get(find);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            right++;
        }
        return count;

    }
}