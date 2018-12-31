class Solution {
    public boolean rotateString(String A, String B) {
        
        if(Objects.equals(A,B)){
            return true;
        }
        else{
            
            ArrayList<Character> ar = new ArrayList<Character>();
            StringBuilder sb = new StringBuilder();
            char[] ch = A.toCharArray();
            
            for(Character c:ch){
                ar.add(c);
            }
            
            char temp = 0;
            int j=0, i=0;
            
            for( ; j<ar.size() ; i++){

                i=0;
                temp = ar.get(i);
                ar.remove(i);
                ar.add(temp);
                j++;
                
                for (Character s : ar)
                {
                    sb.append(s);
                }
                
                if(Objects.equals(sb.toString(),B)){
                    return true;
                }
                
                sb.setLength(0);
                
            }
            
        }
        
        return false;
    }
}
