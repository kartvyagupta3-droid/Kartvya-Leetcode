class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int [] arr=new int [128];
        int max=0,l=0;
        
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);

            while(arr[ch]!=0){
                arr[s.charAt(l)]--;
                l++;
            }
            arr[ch]++;
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}