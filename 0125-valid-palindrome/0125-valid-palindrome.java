class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str= new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }
        int left=0;
        int right= str.length()-1;
        while(left<=right){
        if(Character.toLowerCase(str.charAt(left))==Character.toLowerCase(str.charAt(right))){
            left++;
            right--;
            } else return false;
        }
        return true;

    }
}