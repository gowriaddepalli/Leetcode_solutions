class Solution {
    
    ArrayList<Integer> al = new ArrayList<Integer>();
    
    public List<Integer> findAnagrams(String s, String p) {
        
        int slength = s.length();
        int plength = p.length();
        
        for(int i =0; i< slength-plength+1; i= i+1)
        {
            String subs = s.substring(i, i+plength);
            //System.out.println(subs);
            if(isAnagram(subs,p))
            {
                al.add(i);
            }
        }
        
        return al;
    }
    
    public boolean isAnagram(String subs, String p)
    {
        
        char[] allLetter = new char[128];
        
        for(int i = 0; i<subs.length(); i++){
            allLetter[subs.charAt(i)]++;
        }
        
        for(int i = 0; i<p.length(); i++){
            allLetter[p.charAt(i)]--;
        }
        
        for(int i = 0; i<allLetter.length; i++){
            if(allLetter[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}
