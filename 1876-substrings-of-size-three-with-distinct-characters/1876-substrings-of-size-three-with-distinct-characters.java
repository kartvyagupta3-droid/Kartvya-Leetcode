class Solution {
    public int countGoodSubstrings(String s) {
       int c=0; 

       for(int i=0; i<=s.length()-3; i++){
        char a=s.charAt(i);
        char b=s.charAt(i+1);
        char d=s.charAt(i+2);

        if(a!=b && a!=d && b!=d){
            c++;
        }
       }
       return c;
    }
}