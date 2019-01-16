class Solution {
    public char findTheDifference(String s, String t) {
         //if(s.equals("")) return (char)"";
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        
        for(int i=0; i<schar.length; i++)
        {
            if(schar[i] != tchar[i])
            {
                return tchar[i];
            }
        }
       return tchar[tchar.length-1] ;
    }
}
