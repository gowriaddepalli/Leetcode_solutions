class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<String>();
        for(String p:  tokens)
        {
            if(!p.equals("+") && !p.equals("-")  && !p.equals("*")  && !p.equals("/") )
            {
                st.push(p);
            }else if (p.equals("+"))
            {
                st.push(Integer.toString(Integer.parseInt(st.pop()) + Integer.parseInt(st.pop())));
                //System.out.println(st.peek());
            }else if (p.equals("-")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(Integer.toString(b-a));
                //System.out.println(st.peek());
            }else if (p.equals("*")){
                st.push(Integer.toString(Integer.parseInt(st.pop()) * Integer.parseInt(st.pop())));
                //System.out.println(st.peek());
            }else if (p.equals("/")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(Integer.toString(b/a));
                //System.out.println(st.peek());
            }
        }
        
        return Integer.parseInt(st.pop());
    }
}
