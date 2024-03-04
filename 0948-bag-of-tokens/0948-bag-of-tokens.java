class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int ans=0;
        int l=0,r=tokens.length-1;
        while(l<=r){
            if(tokens[l]<=power){
                power-=tokens[l];
                ans++;
                l++;
            }
            else if(ans>0 && r-1>=l && tokens[l]<=tokens[r-1]+power){
                power+=tokens[r];
                r--;
                ans--;
            }
            else{
                break;
            }
            // System.out.println(power+" "+ans);
        }
        
        return ans;
    }
}