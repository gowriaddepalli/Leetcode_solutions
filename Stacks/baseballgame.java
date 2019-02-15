class Solution {
    public int calPoints(String[] ops) {
        Stack<String> st = new Stack<String>();
        int sum =0;
        for(String r: ops){
            //System.out.println(r);
            switch(r)
            {
                
                case "+": 
                         int l = Integer.parseInt(st.pop()) ;
                         int j =  l+ Integer.parseInt(st.peek());
                         st.push(Integer.toString(l));
                          System.out.println(j);
                          sum += j;
                          st.push(Integer.toString(j));
                         break;
                case "C":
                         String p =st.pop();
                         sum -= Integer.parseInt(p);
                         System.out.println(sum);
                         break;
                case "D": 
                         String s = st.peek();
                         int k = Integer.parseInt(s)*2;
                         sum += k;
                         System.out.println(sum);
                         st.push(Integer.toString(k));
                        // System.out.println(st.peek());
                         break;
                default:
                        st.push(r);
                        //System.out.println(r);
                        sum += Integer.parseInt(r);
                        System.out.println(sum);
                         break;
            }
        }
        return sum;
    }
}
