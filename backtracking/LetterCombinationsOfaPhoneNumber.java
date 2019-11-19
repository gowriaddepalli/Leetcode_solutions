class Solution {
    
    HashMap<String, String> hm = new HashMap<>();
    
    
    
    ArrayList<String> al = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
    hm.put("1", "");
    hm.put("2", "abc");
    hm.put("3", "def");
    hm.put("4", "ghi");
    hm.put("5","jkl");
    hm.put("6", "mno");
    hm.put("7", "pqrs");
    hm.put("8", "tuv");
    hm.put("9", "wxyz");
    hm.put("0","");
        
       if(digits.length() != 0){
           backtrack("", digits);
       } 
        return al;
    }
    
    public void backtrack(String combination, String nextDigit){
        if(nextDigit.length() == 0){
            al.add(combination);
        }else
        {
          String Letters = hm.get(nextDigit.substring(0,1));
          for(int i=0; i<Letters.length(); i++){
            String letter = Letters.substring(i, i+1);
            backtrack(combination+letter, nextDigit.substring(1));
        } 
        }
    
    }
    
    
    
    
}
