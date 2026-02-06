class Solution {
    public double myPow(double x, int n) {
        if(n>0){
            return(pow(x,n));
        }
        else{
            return(1.0/pow(x,n));
        }
         
        
    }
    public static double pow(double x,int n){
        if(n==0){
            return 1.0;
        }
        double ans=pow(x,n/2);
        if(n%2==0){
            return ans*ans;
        }
        else{
            return x*ans*ans;
        }
        
    }

}


/*
class Solution {
    public double myPow(double x, int n) {
        int a =  Math.abs(n);
        double ans=1;
        for(int i=0 ;i<a;i++){
          if(n<0){
                ans=ans/x;
            }
            else{
                ans=ans*x;
            }
        }
        return ans;
    }
}
not so optimal
*/

/*
class Solution {
    public double myPow(double x, int n) {
        long p = n; 
        if (p < 0) {
            x = 1 / x;  
            p = -p;     
        }

        double ans = 1;

        while (p > 0) {
            if ((p & 1) == 1) {   //if p is odd
                ans *= x;
            }
            x = x * x;           
            p=p/2;    
        }

        return ans;
    }
}
*/

