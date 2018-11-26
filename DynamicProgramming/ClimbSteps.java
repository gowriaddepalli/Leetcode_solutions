// Use memoization to store values.

class Solution {
    public int climbStairs(int n) {
        
        int count[] = new int[n+1];
        
        if(n<=0)
        {
          count[0] = 1;
        }
        
        else if( n == 1)
        {
          count[1] = 1;
        }
        
        else
        {
            count[0] = 1;
            count[1] = 1;
            for(int i =2; i<=n;i++)
            {
               
              count[i]= count[i-2] + count[i-1];
              //System.out.println(count[1]);
            }
            
        }
     
        return count[n];
    }
}
