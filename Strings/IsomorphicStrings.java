class Solution {
    public boolean isIsomorphic(String s, String t) {
        // pair mapping, key - value
        // a unique key match a unique value, two keys cant share the same value
        // for a new key, check if the value has been taken
        
        HashSet<Character> valueSet = new HashSet<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        int len = s.length();
        if (t.length() != len) return false;
        for (int i =0 ; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i))) return false;
            }
            else {
                // a new key 
                // check if the value has been taken
                if (valueSet.contains(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
                valueSet.add(t.charAt(i));
            }
        }
        
        return true;
    }
}
