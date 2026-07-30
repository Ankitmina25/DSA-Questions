class Solution {
    public int lengthOfLastWord(String s) {
        int right=s.length()-1;
        int count=0;
        while(right>=0){
            char ch= s.charAt(right);
            if(ch==' '){
                right--;
            }else{
                break;
            }
        }
        while(right>=0){
            char ch=s.charAt(right);
            if(ch==' ') break;
            count++;
            right--;
        }
        return count; 
    }
}