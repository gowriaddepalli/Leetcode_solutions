// Solution: Code to convert a string containing integers to an integer type.

class Solution {
    public int myAtoi(String str) {
        char[] t = str.toCharArray();
        int i = 0, ans = 0; int sign = 1;
        while(i < str.length() && t[i] == ' ') i++;
        if(i < str.length() && (t[i] == '-' || t[i] == '+')) { 
            if(t[i] == '-') { 
                sign = -1; 
            } 
            i++;
        }
        
       //while(i < str.length() && t[i] == '0') i++;
        
        if(i < str.length() && t[i] >= '0' && t[i] <= '9') {
            ans = (ans * 10) + t[i] - '0';
            ans *= sign;
            i++;
        }
        
        while(i < str.length() && t[i] >= '0' && t[i] <= '9') {
            int temp = ans, curr = t[i] - '0';
            if(sign == -1) {
                if((Integer.MIN_VALUE  + curr) / 10 > temp) return Integer.MIN_VALUE;
            } else {
                if((Integer.MAX_VALUE - curr) / 10 < temp) return Integer.MAX_VALUE;
            }
            ans = (ans * 10) + (sign * curr);
            i++;
        }
        return ans;
    }
}
