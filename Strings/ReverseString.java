// Aim to reverse a string in Java.

// Lesson - Try to use String builder instead of strings in java so as to improve performance.
        // - Use stack as data structure as it has the LIFO property which is exactly needed for reversing a string.

public class Solution {
    public String reverseWords(String s) {
    // String r = s.trim();
     String[] p = s.trim().split(" +");
     Stack<String> st  = new Stack<String>();
     StringBuilder sb = new StringBuilder();
        
     for(int i = 0; i< p.length; i++)
     {
       //rev +=  p[i]+ " "; 
       st.push(p[i]);
     }
        
     while(!st.isEmpty())
     {
        sb.append(" ").append(st.pop()); 
     }
        
      String reversed = sb.toString();
        
      return reversed.trim();
    }
}



