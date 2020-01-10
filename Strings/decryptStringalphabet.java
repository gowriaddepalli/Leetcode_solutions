class Solution {
    public String freqAlphabets(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
            int val = 0;
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                val = Integer.parseInt(s.substring(i, i + 2));
                i += 3;
            } else {
                val = Integer.parseInt(s.substring(i, i + 1));
                i += 1;
            }
            sb.append((char)('a' + val - 1));            
        }
        return sb.toString();
    }
}
