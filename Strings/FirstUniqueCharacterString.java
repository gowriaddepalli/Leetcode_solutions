class Solution {
    public int firstUniqChar(String s) {
        int[] alph=new int[26];
        for(char c:s.toCharArray()) {
            alph[c-'a']+=1;
        }
        for(int i=0; i<s.length(); i++) {
            if(alph[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
