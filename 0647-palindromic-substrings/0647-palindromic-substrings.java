class Solution {
    int ans=0;
    int[][] dp;
    public int countSubstrings(String s) {
        dp=new int[s.length()][s.length()];
        
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                // System.out.println("*"+dp[i][j]);
                if(palindrome(s,i,j))ans++;
            }
        }
        return ans;
    }

    private boolean palindrome(String str, int i, int j){
        // int i=0,j=str.length()-1;
        // System.out.println(i+"***"+j);
        int x=i,y=j;
        while(i<j){
            if(dp[i][j]!=0 && dp[i][j]!=-1){
                // System.out.println(i+" "+j);
                dp[x][y]+=1;
                return true;
            }
            if(str.charAt(i)!=str.charAt(j)){
                // System.out.println(i+" "+j);
                dp[x][y]=-1;
                dp[i][j]=-1;
                return false;
            }
            i++;j--;
        }
        // System.out.println(i+" "+j);
        dp[x][y]+=1;
        return true;
    }
}