class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st= new Stack<>();
        int [] arr= new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                    int top=st.peek();
                    st.pop();
                    arr[top]=i-top;
            }
            st.push(i);
        }
        return arr;
    }
}