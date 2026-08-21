class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>((a,b)->  b.getValue()-a.getValue());
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            pq.offer(mp);
        }
        int [] arr= new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll().getKey();
        }
        return arr;
    }

}