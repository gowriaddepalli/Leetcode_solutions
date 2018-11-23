class Solution {
    public int reverse(int x) {
        
        int sign = 1;
        
        
        if(x<0)
        {
            sign = -1;
        }
        
        int number = Math.abs(x);
        int rev = 0;
        int rem = 0;
        
        while(number > 0)
        {
          //System.out.println(number);
          rem =   number % 10;
          if(( sign <0 && (sign*rev) < (Integer.MIN_VALUE/10)  ) || (sign >0 && rev >         (Integer.MAX_VALUE/10)))
          {
             
            return 0;
          }
          rev = rev*10 + rem;
          System.out.println(rev);
          
          number = number/10;
        }
        
        
        
        if (sign<0)
        {
           return -rev; 
        }
        
        return rev;
    }
}
