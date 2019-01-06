class Solution {
    int memo[];
    public int trailingZeroes(int n) {
        memo = new int[n+1];
        Arrays.fill(memo,0);
        int val = factorial(n);
        System.out.println(val);
        // wont work afetr 12!
        int i=0;
        while(val%10 ==0){
            i++;
            val=val/10;
        }
        return i;
    }
    
    public int factorial(int n)
    {
        
        if(n ==0 || n==1)
        {
          memo[n] =1;
          return memo[n];
         } else if(memo[n]!=0)
        {
              return memo[n];
          }else{
            memo[n]= n* factorial(n-1);
        }
      
        return memo[n];
    } 
}


//better soln

class Solution {
    public int trailingZeroes(int n) {
       return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
