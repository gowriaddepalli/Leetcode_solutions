class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
	if(ransomNote.length()>magazine.length()) return false;
	if(ransomNote.isEmpty() && magazine.isEmpty()) return true;
	Map<Character,Integer> charsCount = new HashMap<>();
	for(char c: ransomNote.toCharArray()) {
		if(charsCount.containsKey(c)) {
			charsCount.put(c, charsCount.get(c)+1);
		} else {
			charsCount.put(c, 1);
		}
	}
	for(char c: magazine.toCharArray()) {
		if(charsCount.containsKey(c)) {
			int count = charsCount.get(c);
			if(--count==0) charsCount.remove(c);
			else charsCount.put(c, count);
		}
		if(charsCount.keySet().size()==0) {
			return true;
		}
	}
	return false;
}
}
