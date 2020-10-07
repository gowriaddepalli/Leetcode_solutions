class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> partitionLengths = new ArrayList<>();
        int lastIndex[] =  new int[26];
        
        // Storing the last index of any character appeared.
        for(int i=0; i<S.length(); i++){
            lastIndex[S.charAt(i) - 'a'] = i;
        }
        
        int i=0; 
        // i is used to move the index i till the end of S.
        while(i<S.length()){
            int end = lastIndex[S.charAt(i) - 'a']; // get the end character of a 
            int j = i;
            while(j != end){ // traverse till end of first character.
                end = Math.max(end, lastIndex[S.charAt(j) - 'a']); // reset end if characters in between  are farther than the intial set end.
                j++;
            }
            partitionLengths.add(j-i+1);
            i = j+1;// reset i with character after j.
        }
        
       return  partitionLengths;
        
    }
}
