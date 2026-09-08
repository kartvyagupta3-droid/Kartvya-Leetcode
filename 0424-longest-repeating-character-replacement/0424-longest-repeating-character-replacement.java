class Solution {
    public int characterReplacement(String s, int k) {
        int [] arr =new int [26];
        int l=0,c=0,max=0;

        for(int i=0; i<s.length(); i++){

           arr[s.charAt(i)-'A']++;

           c=Math.max(c,arr[s.charAt(i)-'A']);
 
        while((i-l+1)-c>k){
            
            arr[s.charAt(l)-'A']--;  
            l++;
        }
       
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}