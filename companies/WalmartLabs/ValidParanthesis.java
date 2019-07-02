class Solution {
    public boolean isValid(String s) {
        if(s == ""){
            return true;
        }
        
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length();i++)
        {
          switch(s.charAt(i))
          {
              case ']' :
                  if(st.isEmpty())
                  {
                      return false;
                  }
                  if(st.peek()== '[')
                  {
                      st.pop();
                  }else
                  {
                      return false;
                  }
                  break;
                  
              case ')' :
                  if(st.isEmpty())
                  {
                      return false;
                  }
                  if(st.peek()== '(')
                  {
                      st.pop();
                  }else
                  {
                      return false;
                  }
                  break;
                  
                  
              case '}' : 
                  if(st.isEmpty())
                  {
                      return false;
                  }
                  if(st.peek()== '{')
                  {
                      st.pop();
                  }else
                  {
                      return false;
                  }
                  break;
                  
              default:
                  st.push(s.charAt(i));
                  break;
                  
          }  
        }
        
        if(st.isEmpty()){
            return true;
        }
        
        return false;
    }
}
