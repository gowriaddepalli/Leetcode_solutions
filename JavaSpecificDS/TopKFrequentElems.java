class Solution {
    
    LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();
    ArrayList<Integer> al =  new ArrayList<Integer>();
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++)
        {
            if(lhm.containsKey(nums[i]))
            {
                lhm.put(nums[i], lhm.get(nums[i])+1);
            }else
            {
                lhm.put(nums[i], 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<Map.Entry<Integer, Integer>>(lhm.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() { 
        public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
        return b.getValue().compareTo(a.getValue());} });
        
        for(Map.Entry<Integer,Integer> mp :entries)
        {
            al.add(mp.getKey());
        }
        

        return al.subList(0,k);
    }
}
