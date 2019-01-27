class Solution {
    public String convert(String s, int numRows) {
    
        int r = 0;
        int diagonals = numRows-2;
        if(s.equals("\\s+") || diagonals < 0 ){
            return s;
        }
        StringBuffer sb = new StringBuffer("");
        
        while(r < numRows ){
            for(int i=0;i<s.length(); i++)
            {
                if(i % (numRows+diagonals) == r || i % (numRows+diagonals) == (numRows+diagonals-r)){
                    sb.append(s.charAt(i));
                }
            }
            r++;
        }
        
        return sb.toString();
    }
}


##########################Better Solution###################################

class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}



############################### Another Solution ##############################
class Solution {
    public String convert(String s, int nRows) {
    char[] c = s.toCharArray();
    int len = c.length;
    StringBuffer[] sb = new StringBuffer[nRows];
    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
    
    int i = 0;
    while (i < len) {
        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
            sb[idx].append(c[i++]);
        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
            sb[idx].append(c[i++]);
    }
    for (int idx = 1; idx < sb.length; idx++)
        sb[0].append(sb[idx]);
    return sb[0].toString();
}
}
