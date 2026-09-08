class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int n=cardPoints.length-1;

        for(int i=0; i<k; i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        for(int j=k-1; j>=0; j--){
            sum+=cardPoints[n];
            n--;
            sum-=cardPoints[j];
            max=Math.max(max,sum);
        }
        return max;
    }
}