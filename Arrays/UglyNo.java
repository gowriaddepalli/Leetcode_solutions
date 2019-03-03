class Solution {
    public boolean isUgly(int num) {
        if (num == 0) return false;
        
        final int[] checks = {2, 3, 5};
        for (int i = 0; i < checks.length; i++) {
            while (num % checks[i] == 0) {
                num /= checks[i];
            }
        }
        return num == 1;
    }
}
