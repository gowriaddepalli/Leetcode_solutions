class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int numDivisibles = 0;    // records number of divisibles of k in arr
        for(int num : arr){
            num %= k;
            if(num < 0) num += k;
            
			// if arr[i] is divisible by k
            if(num == 0){
                numDivisibles++;
                continue;
            }
            int remainder = k - num; // two sum strategy
            if(map.containsKey(remainder)){
                map.put(remainder, map.get(remainder) - 1);
                if(map.get(remainder) == 0)
                    map.remove(remainder);
            }
            else{
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        return map.isEmpty() && (numDivisibles % 2 ==0);
    }
}
