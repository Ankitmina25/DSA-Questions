class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int arr[]= new int[tem.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<tem.length;i++){
            while(!st.isEmpty() && tem[i]>tem[st.peek()]){
                int top = st.peek();
                st.pop();
                arr[top]=i-top;
            }
            st.push(i);
        }
        return arr;
    }
}