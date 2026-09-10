class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int left=0;
        int right=0;
        while(left<word1.length() && right<word2.length()){
            char ch= word1.charAt(left);
            str+=ch;
            left++;
            char c= word2.charAt(right);
            str+=c;
            right++;
        }
        while(left<word1.length()){
            char ch= word1.charAt(left);
            str+=ch;
            left++;
        }
        while(right<word2.length()){
            char ch= word2.charAt(right);
            str+=ch;
            right++;
        }
        return str;
    }
}