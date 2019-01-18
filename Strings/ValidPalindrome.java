class Solution {
    public boolean isPalindrome(String s) {
        String sp = s.toLowerCase();
        StringBuffer str = new StringBuffer();
        for(int i=0;i <sp.length(); i++)
        {
            if((int) sp.charAt(i) >96 && (int) sp.charAt(i)<123 || (int) sp.charAt(i) >47 && (int) sp.charAt(i)<58){
                str.append(sp.charAt(i));
            }
        }
        
        if(str.toString().equals(str.reverse().toString()))
        {
            return true;
        }
        return false;
    }
}
