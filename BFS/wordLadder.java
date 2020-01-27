class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wL = new HashSet<>();
        
        for(String s: wordList){
            wL.add(s);
        }
        
        if(!wL.contains(endWord)){
            return 0;
        }
        
        Queue<String> q = new LinkedList<>();
        int level =1;
        
        q.offer(beginWord);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                String word = q.poll();
                char[]  s = word.toCharArray();
                for(int j=0; j<s.length; j++){
                    char org_char = s[j];              
                    for(char k='a'; k<'z'; k++){
                        if(s[j] == k)
                        {continue;}
                        s[j] = k;
                        String transformedWord = String.valueOf(s);
                        if(transformedWord.equals(endWord)){return level+1;}
                        if(wL.contains(transformedWord)){
                            q.offer(transformedWord);
                            wL.remove(transformedWord);
                        }
                    }
                  s[j] =   org_char;
                }
            }
            
            level++;
            
        }
        return 0;
    }
}
