class Solution {
    public String decodeString(String s) {
        Stack<String> st= new Stack<>();
        Stack<Integer> countnum= new Stack<>();
         int num=0;
         String str= "";
      
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(Character.isDigit(ch)) num=num*10+(ch-'0'); 
            else if(ch=='['){
            countnum.push(num);
            st.push(str);
            num=0;
            str="";
            }else if(Character.isLetter(ch)) str+=ch; else{
            int count=countnum.pop();
            String previous= st.pop();
            String temp="";
            while(count>0){
            temp+=str;
            count--;
            }
            str= previous+temp;
            }
        }
            return str;
    }
}