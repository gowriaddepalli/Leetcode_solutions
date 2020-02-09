class Solution {
    public boolean isMatch(String s, String p) {
    
    // The aim is build a table for the expression.
    // the condition for checking
        
    // s[i] = p[j] || p[j]= ? 
    //  :t[i][j] = t[i-1][j-1]
        
    // s[i] != p[j] = false;
        
    // if p[j] = *
     //   t[i-1][j] || t[i][j-1]
        

       
    // first checking for  multiple ** and replacing it with single one
        
            
    int k=1;
    StringBuffer sb = new StringBuffer();
    if(p.length()>0)
    {
      sb.append(p.charAt(0));  
    }
    
        
    while(k<p.length())
    {
       if(p.charAt(k-1) == '*'){
           while(k< p.length() && p.charAt(k) == '*'){
               k++;
           }
       }
       
      if(k<p.length()){
        sb.append(p.charAt(k));  
      }
       
       k++;
    }
        
    String p1 = sb.toString();
    
    char[] s1 = s.toCharArray();
    char[] p2 = p1.toCharArray();
        
    boolean[][] t = new boolean[s1.length+1][p2.length+1];
    
        
    t[0][0] = true;
        
    if(p1.length() > 0 && p2[0]=='*'){
        t[0][1] = true;
    }
        
        for(int i=1; i< t.length; i++){
            for(int j=1; j< t[0].length; j++){
                if(s1[i-1] == p2[j-1] || p2[j-1] == '?'){
                    t[i][j] = t[i-1][j-1];
                }
                
                
                if(p2[j-1] == '*'){
                    t[i][j] = t[i-1][j] || t[i][j-1];
                }
            }
        }
        
        System.out.println(t[s.length()][p1.length()]);
        
        
       return t[s.length()][p1.length()]; 
    }
}
