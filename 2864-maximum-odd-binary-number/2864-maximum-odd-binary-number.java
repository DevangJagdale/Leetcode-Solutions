class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')one++;
        }
        String ans="";

        while(one>0){
            ans+="1";
            one--;
        }
        
        while(ans.length()!=s.length()-1){
            ans+="0";
        }
        ans+="1";
        
        return ans;
        
    }
}