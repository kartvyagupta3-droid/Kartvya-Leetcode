class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int [] feq=new int [3];
        int n=s.length();
        int l=0;
        
        for(int i=0; i<n; i++){
          feq[s.charAt(i) -'a']++;
             
          while(feq[0]>0 && feq[1]>0 && feq[2]>0){
             c+=s.length()-i;
             feq[s.charAt(l) -'a']--;
             l++;
            }
        }
        return c;
    }
}