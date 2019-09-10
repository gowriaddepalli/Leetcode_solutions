class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> al = new ArrayList<String>();
        backtrack(al, "", 0,0,n);
        return al;
    }
    
     void backtrack(ArrayList<String> al, String Cur, int open, int closed, int max)
     {
         if(Cur.length() == 2*max){
             al.add(Cur);
             return;
         }
         
         if(open <max){
             backtrack(al,Cur+ '(', open+1, closed,max);
         }
         if(closed <open){
             backtrack(al,Cur+ ')', open, closed+1,max);
         }
     }
}
