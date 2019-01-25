class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] Awords = A.split("\\s+");
        String[] Bwords = B.split("\\s+");
        
        Map<String, Integer> hm = new HashMap<String, Integer>();
        List<String> al = new ArrayList<String>();
        
      
        for(int i=0; i<Awords.length; i++)
        {
          if (hm.containsKey(Awords[i]))
             {
                hm.put(Awords[i], hm.get(Awords[i])+1);
             }else
             {
                hm.put(Awords[i], 1);
             }  
        }
        
         for(int i=0; i<Bwords.length; i++)
        {
          if (hm.containsKey(Bwords[i]))
             {
                hm.put(Bwords[i], hm.get(Bwords[i])+1);
             }else
             {
                hm.put(Bwords[i], 1);
             }  
        }
        
      for (String word: hm.keySet())
            if (hm.get(word) == 1)
                al.add(word);
             
               
               return al.toArray(new String[al.size()]);
               }
}
