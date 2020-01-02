class Solution {
public int minSubArrayLen(int s, int[] nums) {
    if (nums == null || nums.length == 0) {
	    return 0;
    }
    int minLen = Integer.MAX_VALUE;
    int start = 0;
    int localSum = 0;
    for (int end = 0; end < nums.length; end++) {
	    localSum += nums[end];
	    while (localSum >= s) {
		    minLen = Math.min(minLen, end - start + 1);
		    localSum -= nums[start++];
	    }
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
}
}
