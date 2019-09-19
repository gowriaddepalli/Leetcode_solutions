class Solution {
    public boolean isStrobogrammatic(String num) {
        HashMap<Integer, Integer> ht  = new HashMap<>();
        ht.put(6,9);
        ht.put(8,8);
        ht.put(1,1);
        ht.put(9,6);
        ht.put(0,0);
        
        String s = "";
        
        for(int i=num.length()-1; i>=0; i--){
            if(ht.containsKey(Character.getNumericValue(num.charAt(i)))){
                s+=""+ ht.get(Character.getNumericValue(num.charAt(i)));
            }else{
                return false;
            }
        }
        System.out.println(s.equals(num));
       return (s.equals(num))? true: false; 
    }
}
