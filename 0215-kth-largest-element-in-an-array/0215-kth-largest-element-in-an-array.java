class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> b-a);
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        int val=0;
        for(int i=1;i<=k;i++){
            val=pq.poll();
        }
        return val;
    }
}