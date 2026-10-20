class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        HashMap<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> {
           int dif = Math.abs(a.getValue())-Math.abs(b.getValue());
           if(dif!=0) return dif;
            int num1= arr[a.getKey()];
            int num2= arr[b.getKey()];
            return num1-num2;
    });
        for(int i=0;i<arr.length;i++){
        int val=arr[i]-x;
        map.put(i,val);
    }
        for( Map.Entry<Integer,Integer> mp : map.entrySet()){
            pq.offer(mp);
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<k;i++){
            int val= pq.poll().getKey();
            ans.add(arr[val]);
        }
        Collections.sort(ans);
        return ans;
    }
}