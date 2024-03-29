class Solution {
    HashMap<String,Boolean> dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<String>();
        dp=new HashMap<String,Boolean>();
        
        dp.put("",true);
        
        for(String str: wordDict){
            set.add(str);
        }
        
        return sol(s,set);
    }
    
    public boolean sol(String s, Set<String> set){
        // if(s.equals(""))return true;
        if(dp.containsKey(s))return dp.get(s);
        // System.out.println(s);
        int i=0;
        // for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp=s.substring(i,j);
                if(set.contains(temp)){
                    // System.out.println(temp);
                    String str2=s.substring(j,s.length());
                    // if(str2.equals(""))return true;
                    if(sol(str2,set)){
                        // System.out.println("*"+temp);
                        dp.put(s,true);
                        return true;
                    // }
                }
            }
        }
        dp.put(s,false);
        return false;
    }
}