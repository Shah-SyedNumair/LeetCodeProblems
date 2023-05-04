class Solution {
    public double myPow(double x, int n) {
       double p = x, r = 1, pow = n;
        if(n == 0) return 1;
        else if(n == 1) return x;
        if(pow < 0) pow *= -1;
        while(pow > 1){
            if(pow %2 == 1){
                pow--;
                r *= p;
            }
            p *= p;
            pow /= 2;
        }
        return n<0 ? 1/(p*r) : p*r;
    }
}