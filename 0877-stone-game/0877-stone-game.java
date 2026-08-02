class Solution {
    public boolean stoneGame(int[] piles) {
        for(int i=0; i<piles.length; i++){
        if(piles[i]%2==0){
            return true;
        }
        } 
        return true;
    }
}