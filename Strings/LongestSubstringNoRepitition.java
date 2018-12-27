class Solution {
    public int lengthOfLongestSubstring(String s) {
        char sub[] = s.toCharArray();
        String finalSubstring = "";
        int max = 0;
        
        LinkedHashSet<Character> lhm = new LinkedHashSet<Character>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        for(int i=0; i<sub.length; i++)
        {
            if(!lhm.contains(sub[i])){
                lhm.add(sub[i]);
               finalSubstring += Character.toString(sub[i]);
            }
            else
            {
              //System.out.println(finalSubstring);
              if(max<finalSubstring.length())
              {
                ar.add(finalSubstring.length());  
                max = finalSubstring.length();
              }
              //System.out.println(i);
              i=i-(finalSubstring.length());
              //System.out.println(i);
              finalSubstring = "";
              lhm.clear();
            }
        }
        //System.out.println(finalSubstring);
        ar.add(finalSubstring.length());
        
       return Collections.max(ar);
        
    }
}
