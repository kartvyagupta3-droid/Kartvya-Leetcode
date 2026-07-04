class Solution {
    public char findTheDifference(String s, String t) {
        char r = 0;
        for (char c : s.toCharArray()) {
            r ^= c;
        }
        for (char c : t.toCharArray()) {
            r ^= c;
        }
        return r;
        // int sum=0;
        // for(int i=0; i<s.length(); i++){
        //     sum+=t.charAt(i);
        // } for(int i=0; i<s.length(); i++){
        //     sum-=s.charAt(i);
        // }
        // return (char)sum;
    }
}