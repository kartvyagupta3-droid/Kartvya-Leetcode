class Solution {
    public double myPow(double x, int n) {
       
       long N=n;
       if(N<0){

        
        N=-N;
        return 1.0/recur(x,n);
       }
       return recur(x,n);
    }

        private double recur(double x,long n){
         if(n==0){
            return 1.0;
         }
         double half=recur(x,n/2);

        if(n%2==0){
            return half*half;
        }
        else{
            return x*half*half;
        }
     }
}
