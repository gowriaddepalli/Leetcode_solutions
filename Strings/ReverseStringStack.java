class Solution {
    public String reverseString(String s) {
     
        Stack<Character> st = new Stack<Character>();
        char[] strj = s.toCharArray();
        
        for(char p: strj){
            st.push(p);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
          sb.append(st.pop());  
        }
        
        return sb.toString();
    }
}
