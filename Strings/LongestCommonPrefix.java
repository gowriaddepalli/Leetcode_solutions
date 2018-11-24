class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String minstrng = getShortestString(strs);
        //System.out.println(minstrng);
        boolean flag = false;
        
        for(int j = minstrng.length(); j>=0; j--){
            String sbspr = minstrng.substring(0, j);
            System.out.println(sbspr);
            for(String lm: strs)
            {
                if(!lm.startsWith(sbspr)){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            
        if(flag)
        {
           return sbspr; 
        }      
        }
        
      return "";  
    }
    
    String getShortestString (String[] strs){
        int min =10000;
        String minstrng = "";
        
        for(String rep: strs){
            if (rep.length() < min){
                min = rep.length();
                minstrng = rep;
            }
        }
        
        return minstrng;
    }
}
