
Pseudo code for the question:

#### 1. valid paranthesis:

1. create a stack of characters.
2. if string is empty return true - base
3. traverse through the string - min o(string length):
4. switch(str.charAt(i))
5. check for 3 these three current characters:
   a. paranthesis ']'
   b. paranthesis '}'
   c. paranthesis ')'
when you get these,
     first check for stack is empty or not, if it is return false;
     else check for peek '['| '{' | ')'
     if exists stack.pop()
     else
     return false
     break
     
     
 Return true if only in the end the stack is empty.
 Return false by default
 
 
 Time Complexity: o(N) - string traversal
 Space Complexity: o(N) - stack space
 
 
 
 class ValidParanthesis{
 
 public boolean isValidParanthesis(String s) {
 
 if(s.equals(""))
 {
    return false;
 }
 
 
 Stack<Character> st = new Stack<Character>();
   
 for(int i=0; i<s.length(); i++)
 {
                            
    Switch(s.charAt(i))
    {
      char ']':
      if(st.isEmpty()){
      return false;
      }
      if(st.peek("["){
      st.pop();
      }
      else{
      return false;
      }
      break;
      
      char '}':
      if(st.isEmpty()){
      return false;
      }
      if(st.peek("}"){
      st.pop();
      }
      else{
      return false;
      }
      break;
       
      char ')':
      if(st.isEmpty()){
      return false;
      }
      if(st.peek("("){
      st.pop();
      }
      else{
      return false;
      }
      break;
      
      default:
      st.push(s.charAt(i))
    
    }
                            
 if(st.isEmpty())
 {
     return true;
 }
 
 return false;
 
 }
 
 
 public static void main(String[] args)
 
 {
  return isValidParanthesis("{{}}");
 
 }
 
 
 }
 
 
 
 
  
 
   
   

