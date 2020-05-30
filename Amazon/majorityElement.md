## MajorityElement

#### BruteForce:
1. check for every element in quadratic time, if it has itself repeating more than o(n^2).

#### Using hashmap as trade of to decrease time complexity.

store every element in hashmap with its frequency.

time complexity -> o(n)
space -> o(n)

#### Using sorting:

So the trick here is, 

sort the array -> best sorting -> o(nlogn)
get the middle element, as that will be the majority element, as it covers more than n/2 positions.

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
