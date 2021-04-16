https://leetcode.com/problems/kth-missing-positive-number/discuss/876751/Java-1-liner-O(n)-simplest-easy-to-understand-beats-100

'''suppose the array starts with 8, and you are told to find 5th missing element.
Now since array starts with 8 ,it means number 1 to 7 are missing.
so 5th missing element is 5 itself (because all numbers before 5 are missing)(1,2,3,4,5). similar is the case for 1st to 7th missing element.

Now what if the array starts with 2 i.e for ex [2,8] and ur told to find 5the missing element.
here 5 is not the answer, because all number before 5 are not missing, one number is found i.e 2, so the 5th number is actually 6 (1,3,4,5,6) (5 incremented by 1 since one number is found)

but what if array had a number <= 6 , ex 3 i.e [2,3,8] then 6 wont the the answer since one more number <=6 is found , the missing numbers are [1,4,5,6,7] so again we increment 6 to 7.

so we need to keep incrementing K unless all elements in array are less than K,
with this K shifts by one for each element <= K found in the list.'''

class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i : arr){
			if(i <= k) k++; else break;
		}
        return k;
    }
}
