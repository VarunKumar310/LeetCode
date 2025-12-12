class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long a=n;
        if(a<0){
            x=1/x;
            a=-a;
        }
        while(a!=0){
            if((a&1)==1){
            ans=ans*x;
            }
            x=x*x;
            a=a>>1;
        }
        return ans;



        
    }
}