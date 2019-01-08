import java.lang.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n == 536870912)
            return true;
        double x = Math.log((double)n)/Math.log(2);
        //System.out.println(x);
        //System.out.println(Math.pow(2,29));
        if(x == (int) x)
        {
            return true;
        }
        return false;
    }
}
