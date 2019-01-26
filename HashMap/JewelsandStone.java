class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        String[] jstr =  J.split("");
        String[] Sstr = S.split("");
        Map<String,Integer> hm= new HashMap<>();
        
        for(int i=0; i<Sstr.length; i++){
           if(hm.containsKey(Sstr[i])){
               hm.put(Sstr[i], (hm.get(Sstr[i])+1));
           } else{
               hm.put(Sstr[i], 1);
           }
        }
        
        for(int i=0; i<jstr.length; i++){
            if(hm.containsKey(jstr[i])){
                count += hm.get(jstr[i]);
            }
        }
        
        return count;

    }
}


############ Better Solution ############################

class Solution 
{
    public int numJewelsInStones(String J, String S) 
    {
        int [] map = new int[256];
        int count = 0;
        for (char c: J.toCharArray())
        {
            map[c]++;
        }
        for (char c: S.toCharArray())
        {
            if (map[c] > 0)
            {
                count++;
            }
        }
        return count;
    }
}
