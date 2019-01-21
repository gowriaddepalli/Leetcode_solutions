class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        
        for(int i=0; i< nums1.length; i++)
        {
           for(int j=0; j<nums2.length; j++){
               if(nums2[j]== nums1[i]){
                  // System.out.println(j);
                   
                    while((j+1< nums2.length) && (nums2[j+1]<nums1[i])){
                        j++;
                    }
                   
                   if(j+1< nums2.length && nums2[j+1]>nums1[i]){
                       //System.out.println(j+1);
                       res[i]= nums2[j+1];
                   }
               }
           } 
        }
        
        return res;
    }
}

########################################################### Better Solution ############################################################

public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }

