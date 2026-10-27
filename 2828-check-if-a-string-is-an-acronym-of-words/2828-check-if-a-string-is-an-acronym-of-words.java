class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
       return che(words, s, 0);
    }
    private boolean che(List<String> words, String s, int i){
        if(i==words.size()){
            return true;
        }
        if(words.get(i).charAt(0)!=s.charAt(i)){
            return false;
        }
        return che(words, s, i+1 );
    }
}