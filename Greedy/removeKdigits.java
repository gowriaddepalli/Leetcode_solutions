class Solution {
    
    // Reference: https://www.youtube.com/watch?v=vbM41Zql228
    
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        int counter =0;
        int size = num.length();
        
        if(k == size){
            return "0";
        }
            
        StringBuffer sb = new StringBuffer();
        
        while(counter < size){
            
            while(k>0 && !s.isEmpty() && s.peek()> num.charAt(counter)){
                
                s.pop();
                k--;
            }
            
            
            s.push(num.charAt(counter));
            counter++;
            
        }
        
        while(k>0){
            s.pop();
            k--;
        }
        
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        
        
        
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
        
    }
}
