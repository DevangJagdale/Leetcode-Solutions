class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ans=0,freq=0,prev=-1,c=1;
        boolean check=false;
        Arrays.sort(nums);
        for(int n:nums){
            // System.out.println(ans+" "+freq+" "+prev+" "+c);
            if(prev!=n){
                check=true;
                if(c > freq){
                    ans=c;
                    freq=c;
                }
                else if(c==freq){
                    ans+=c;
                }
                prev=n;
                c=1;
            }
            else{
                check=false;
                c++;
            }
        }
        if(!check){
            if(c > freq){
                ans=c;
                freq=c;
            }
            else if(c==freq){
                ans+=c;
            }
        }
        return ans;
    }
}