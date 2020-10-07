class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        int n = s.length();
        int i=0;
        
        HashMap<String, Integer> ht = new HashMap<>();
        List<String> ls = new ArrayList<>();
        
        while(i<=n-10){
            String sub = s.substring(i, i+10);
            if(!ht.containsKey(sub)){
                ht.put(sub,1);
            }else{
                ht.put(sub,ht.get(sub)+1);
            }
            i++;
        }
        
        for(Map.Entry<String,Integer> es: ht.entrySet()){
            if(es.getValue()>1)
            {
                ls.add(es.getKey());
            }
        }
      
        return ls;
        
    }
}
