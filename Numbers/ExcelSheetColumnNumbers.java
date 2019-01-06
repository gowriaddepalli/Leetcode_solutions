//base 26 conversion
class Solution {
    public int titleToNumber(String s) {
        int val = 0;
        int j =0;
        for(int i= s.length()-1; i>=0; i--){
            val += ((int)Math.pow(26,j))*((int)s.charAt(i)-64);
            j++;
        }
        return val;
    }
}
