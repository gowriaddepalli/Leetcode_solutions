import java.util.*; 
class Solution {
    public int repeatedNTimes(int[] A) {
        Hashtable<Integer, Integer> ht = 
                      new Hashtable<Integer, Integer>(); 
        int val =0;
        for(int i=0; i<A.length; i++){
            if(ht.containsKey(A[i])){
                val = A[i];
            }else{
                ht.put(A[i],1);
            }
        }
        return val;
    }
}
