// Lesson Learnt : Travel only upto the square root of the number.
// If a number is prime, all its multiples are not prime.

class Solution {
    public int countPrimes(int n) {
        
        if(n<=0){
            return 0;
        }
        boolean []flag = new boolean[n];

        int count = 0;

        for(int i =2;i<Math.sqrt(n);i++){
            if(!flag[i]){
                for (int j = i;i*j<n;j++){
                    flag[i*j] = true;
                }
            }

        }

        for (int i =2;i<n;i++){
            if(!flag[i]){
                count++;
            }
        }

        return count;
    }
}
