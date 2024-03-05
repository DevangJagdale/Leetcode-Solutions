class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        
        while(i<j){
            // System.out.println(i+" "+j);
            if(s.charAt(i)==s.charAt(j)){
                if(j-i==1)return 0;
                if(j==i)return 1;
                int x=i,y=j;
                char temp=s.charAt(i);
                while(s.charAt(y)==temp && x<y){
                    // if(x==y)return 1;
                    y--;
                }
                // y++;
                // y=j;
                if(y==x)return 0;
                
                while(s.charAt(x)==temp && x<y){
                    // if(x==y)return 1;
                    x++;
                }
                // x--;
                // if(x==y)return 1;
                // if(y<=x)return 0;
                
                i=x;
                j=y;
            }
            else{
                break;
            }
        }
        
        return j-i+1;
    }
}