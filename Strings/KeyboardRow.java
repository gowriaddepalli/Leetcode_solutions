class Solution {
        public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        String[] levels = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (String word : words) {
            for (String level : levels) {
                int lettersCount = word.length();
                for (int k = 0; k < word.length(); k++) {
                    char c = Character.toLowerCase(word.charAt(k));
                    if (level.indexOf(c) < 0) {
                        break;
                    }
                    lettersCount--;
                }
                if (lettersCount == 0) {
                    result.add(word);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
