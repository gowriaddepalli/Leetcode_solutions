class Solution {
    public int[] plusOne(int[] digits) {
        // case wehen every number is less than 9
        int n = digits.length;
        for(int i = n-1; i>=0; i--)
        {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            
            digits[i]=0;
                  
        }
        
        int newno[] = new int[n+1];
            // cases for overflow. By default Arrays elements are set to zero.
        newno[0] = 1;
        
        return newno;
    }
}
