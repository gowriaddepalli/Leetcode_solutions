class Solution {
    public String simplifyPath(String path) {
        
    }
}
1
class Solution {
2
    public String simplifyPath(String path) {
3
        if(path.length()==0)
4
            return "";
5
        String[] arr = path.split("/",0);
6
        Deque<String> st = new LinkedList<String>(); 
7
        for(String a:arr){
8
            if(!(a.equals(""))){
9
                if(a.equals(".")){}
10
                else if(a.equals("..")){
11
                    if(!(st.isEmpty()))
12
                        st.removeLast();
13
                }else
14
                    st.add(a);
15
            }
16
        }
17
        StringBuilder sb = new StringBuilder();
18
        if(st.isEmpty())
19
            sb.append('/');
20
        while(!(st.isEmpty())){
21
            sb.append('/');
22
            sb.append(st.pop());
23
        }
24
        return sb.toString();
25
    }
26
}
