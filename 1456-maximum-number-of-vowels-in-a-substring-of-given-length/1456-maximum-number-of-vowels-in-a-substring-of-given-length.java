class Solution {
    public int maxVowels(String s, int k) {
        
       int count =0;
        int n=s.length();
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<n;i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                count++;
            }
            if("aeiou".indexOf(s.charAt(i-k)) != -1){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}