class Solution {
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1.0;
        }

       
        double result = Math.exp(
            (double) n * Math.log1p(Math.abs(x) - 1.0)
        );

        
        if (x < 0 && (n & 1) != 0) {
            result = -result;
        }

        return result;
    }
}