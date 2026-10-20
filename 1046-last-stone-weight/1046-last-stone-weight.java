class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mx= new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<stones.length;i++){
            mx.offer(stones[i]);
        }
        while(mx.size()>1){
            int x= mx.poll();
            int y=mx.poll();
            if(x!=y){
            int val= Math.abs(x-y);
            mx.add(val);
            }
        }
        if(mx.isEmpty()) return 0;
        return mx.poll();
    }
}