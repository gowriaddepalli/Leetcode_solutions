class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int n = nums.length;
        int c =-1;
        if(nums.length ==1)
        {
            c = nums[0];
        }
        for(int i =0; i<nums.length; i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }else
            {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }
        
        for(int i=0; i<nums.length; i++)
        {
          //System.out.println(hm.get(nums[i]));
            //System.out.println(StrictMath.ceil(nums.length/2.0));
          if(hm.get(nums[i])>= Math.ceil(n/2.0))
            {
                    c = nums[i];
                    break;
            }
        }
        
        return c;
    }
}

/*
Better Solution:

Approach 3: Sorting
Intuition

If the elements are sorted in monotonically increasing (or decreasing) order, the majority element can be found at index \lfloor \dfrac{n}{2} \rfloor⌊ 
2
n
​	
 ⌋ (and \lfloor \dfrac{n}{2} \rfloor + 1⌊ 
2
n
​	
 ⌋+1, incidentally, if nn is even).

Algorithm

For this algorithm, we simply do exactly what is described: sort nums, and return the element in question. To see why this will always return the majority element (given that the array has one), consider the figure below (the top example is for an odd-length array and the bottom is for an even-length array):

Sorting middle index overlap

For each example, the line below the array denotes the range of indices that are covered by a majority element that happens to be the array minimum. As you might expect, the line above the array is similar, but for the case where the majority element is also the array maximum. In all other cases, this line will lie somewhere between these two, but notice that even in these two most extreme cases, they overlap at index \lfloor \dfrac{n}{2} \rfloor⌊ 
2
n
​	
 ⌋ for both even- and odd-length arrays. Therefore, no matter what value the majority element has in relation to the rest of the array, returning the value at \lfloor \dfrac{n}{2} \rfloor⌊ 
2
n
​	
 ⌋ will never be wrong.


Complexity Analysis

Time complexity : O(nlgn)O(nlgn)

Sorting the array costs O(nlgn)O(nlgn) time in Python and Java, so it dominates the overall runtime.

Space complexity : O(1)O(1) or (O(n)O(n))

We sorted nums in place here - if that is not allowed, then we must spend linear additional space on a copy of nums and sort the copy instead.

*/


