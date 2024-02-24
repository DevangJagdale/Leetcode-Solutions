class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        
        while(i<j){
            int minele=Math.min(height[i],height[j]);
            int temp=(minele*(j-i));
            // System.out.println(i+" "+j+" "+temp+" "+minele);
            ans=Math.max(ans,temp);
            if(height[i]>height[j])j--;
            else i++;
        }

        return ans;
    }
}