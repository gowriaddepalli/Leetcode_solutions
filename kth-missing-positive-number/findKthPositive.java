https://leetcode.com/problems/kth-missing-positive-number/discuss/876751/Java-1-liner-O(n)-simplest-easy-to-understand-beats-100

class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i : arr){
			if(i <= k) k++; else break;
		}
        return k;
    }
}
