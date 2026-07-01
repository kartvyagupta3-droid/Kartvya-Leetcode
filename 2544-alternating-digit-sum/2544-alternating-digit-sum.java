class Solution {
    public int alternateDigitSum(int n) {
        int sum1=0,sum2=0,count=0;

        while(n>0){
            if(count%2==0){
                sum1+=n%10;
            }else{
                sum2-=n%10;
            }
            n/=10;
            count++;
        }
        if(count%2==1){
            return sum1+sum2;
        }
        else{
        return -(sum1+sum2);}
    }
}