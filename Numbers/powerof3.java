class Solution {
    public boolean isPowerOfThree(int n) {
        
        //System.out.println((Math.log(45) / Math.log(3)));
        if(n <= 0){
            return false;
        }
        double x = (Math.log10(n) / Math.log10(3));
        System.out.println(x);
        if ((x)  == Math.floor(x))
        {
            return true;
        }
        return false;
    }
}
