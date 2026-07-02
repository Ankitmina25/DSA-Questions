class Solution {
    public void helper(int n, List<String> ans,String str , int open,int close){
        if(str.length()==n*2){
            ans.add(str);
            return;
        }
        if(open<n){
            helper(n,ans,str+'(',open+1,close);
        }
        if(close<open){
            helper(n,ans,str+')',open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        helper(n,ans,"",0,0);
        return ans;
    }
}