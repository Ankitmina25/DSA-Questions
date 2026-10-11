class Solution {
    public String reverseWords(String s) {
        String[] st= new String[s.length()];

        int word=0;
       String curr= "";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(!curr.isEmpty()){
                 st[word]=curr;
                 word++;
                 curr="";
                }
            }else curr+=ch;
        }
        if(!curr.isEmpty()){
            st[word]=curr;
            word++;
        }
        String ans="";
        for(int i=word-1;i>=0;i--){
            ans+=st[i];
            if(i>0) ans+=' ';
        }
        return ans;
    }
}