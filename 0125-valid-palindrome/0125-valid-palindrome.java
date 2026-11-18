class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                st+=Character.toUpperCase(ch);
            }
        }
        int left=0;
        // String st=str.toLowerCase();
        int right=st.length()-1;
        while(left<=right){
            char lc=st.charAt(left);
            char rc=st.charAt(right);
            if(lc!=rc) return false;
            left++;
            right--;
        }
        return true;
    }
}