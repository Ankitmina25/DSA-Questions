class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left=0;
        int right=0;
        String str="";
        while(left<word1.length() || right<word2.length()){
            if(left<word1.length()){
                char ch=word1.charAt(left);
                str+=ch;
                left++;
            }
            if(right<word2.length()){
                char ch=word2.charAt(right);
                str+=ch;
                right++;
            }
        }
        return str;
    }
}