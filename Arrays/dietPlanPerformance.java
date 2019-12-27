class Solution {
        public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        if (k <= 0 || k > calories.length) return 0;
        int cals = 0, score = 0, l = 0;//left was first in window
        for (int i = 0; i < k; i++) {//sum up first window
            cals += calories[i];
        }
        int point = 0;
        if (cals < lower) point = -1;
        if (cals > upper) point = 1;
        score += point;
        for (int i = k; i < calories.length; i++) {
            cals += calories[i];//add ith day value
            cals -= calories[l++];//sub (i - k)th day value
            point = 0;
            if (cals < lower) point = -1;
            if (cals > upper) point = 1;
            score += point;
        }
        return score;
    }
}
