class Solution {
    public boolean isAnagram(String s, String t) {
     char [] s3=s.toCharArray();
     char [] s4=t.toCharArray();
     Arrays.sort(s3);
     Arrays.sort(s4);
     if(Arrays.equals(s3,s4)){
        return true;
     }
     return false;
    }
}