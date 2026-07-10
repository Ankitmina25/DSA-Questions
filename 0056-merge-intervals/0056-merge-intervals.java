class Solution {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)->  a[0]-b[0]);
        int k=0;
        int [][] arr= new int[intervals.length][2];
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int startIdx=intervals[i][0];
            int endIdx=intervals[i][1];
            if(end>=startIdx){
                end=Math.max(end,endIdx);
            }else{
                arr[k][0]=start;
                arr[k][1]=end;
                k++;
                start=startIdx;
                end=endIdx;
            }
        }
        arr[k][0]=start;
        arr[k][1]=end;
        k++;
        return Arrays.copyOf(arr,k);
    }
}