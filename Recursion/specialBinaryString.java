class Solution {
    
// Reference : https://leetcode.com/problems/special-binary-string/discuss/113211/JavaC%2B%2BPython-Easy-and-Concise-Recursion
    
    /*
    Just 4 steps:

    Split S into several special strings (as many as possible).
    Special string starts with 1 and ends with 0. Recursion on the middle part.
    Sort all special strings in lexicographically largest order.
    Join and output all strings.
*/
    
    
   public String makeLargestSpecial(String S) {
        int count = 0, i = 0;
        List<String> res = new ArrayList<String>();
        for (int j = 0; j < S.length(); ++j) {
          if (S.charAt(j) == '1') count++;
          else count--;
          if (count == 0) {
            res.add('1' + makeLargestSpecial(S.substring(i + 1, j)) + '0');
            i = j + 1;
          }
        }
        Collections.sort(res, Collections.reverseOrder());
        return String.join("", res); 
}
    
}
