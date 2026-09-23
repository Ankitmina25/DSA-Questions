class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)) str+=ch;
        }
       String st = str.toLowerCase();
        int left=0;
        int right=st.length()-1;
        while(left<=right){
            char lc=st.charAt(left);
            char rc=st.charAt(right);
            if(lc!=rc){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}