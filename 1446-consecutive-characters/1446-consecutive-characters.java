class Solution {
    public int maxPower(String s) {
        
     return solve(1,1,0,s);
    }
   private int solve(int max, int current, int in, String s){
        if(in==s.length()){
            return max;
        }
        if(in>0 && s.charAt(in)==s.charAt(in-1)){
            current++;
        }else{
            current=1;
        }
        max=Math.max(max,current);
        return solve(max,current,in + 1,s);
    }
}