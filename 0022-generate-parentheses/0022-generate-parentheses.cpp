class Solution {
public:
    void helper(int n,vector<string>& ans,string curr,int o,int c){
        if(curr.size()==n*2){
            ans.push_back(curr);
            return;
        }
        if(o<n){
            helper(n,ans,curr+"(",o+1,c);
        }
        if(c<o){
            helper(n,ans,curr+")",o,c+1);
        }
    }
    vector<string> generateParenthesis(int n) {
        vector<string>ans;
        helper(n,ans,"(",1,0);
        return ans;
        
    }
};