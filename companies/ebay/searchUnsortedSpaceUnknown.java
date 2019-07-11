class Solution {
    public int search(ArrayReader reader, int target) {
        int hi = 1;
        while(reader.get(hi)< target){
            hi = hi << 1;
           // System.out.println(hi);
        }
        int low = hi >> 1;
        //System.out.println(low);
        
        while(low <= hi){
            int mid = hi +((low-hi)/2);
            if(reader.get(mid) == target){
                return mid;
            }else if(reader.get(mid) < target){
                low = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
}
