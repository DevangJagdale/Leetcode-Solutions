class Solution {
    public String customSortString(String order, String s) {
        String ans="";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                int val=map.get(s.charAt(i));
                map.put(s.charAt(i),val+1);
            }
        }
        
        for(int i=0;i<order.length();i++){
            if(map.containsKey(order.charAt(i))){
                int n=map.get(order.charAt(i));
                while(n>0){
                    ans+=order.charAt(i);
                    n--;
                }
                map.put(order.charAt(i),0);
            }
        }
        
        for(Character name : map.keySet()){
            int val=map.get(name);
            
            while(val>0){
                ans+=name;
                val--;
            }
        }
        
        return ans;
    }
}