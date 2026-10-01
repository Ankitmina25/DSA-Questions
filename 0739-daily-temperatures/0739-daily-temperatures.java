class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st= new Stack<>();
        int n=temperatures.length;
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
               int pre = st.pop();
                arr[pre]=i-pre;
            } 
            st.push(i);
        }
        return arr;
    }
}