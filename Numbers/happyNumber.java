class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do
        {
           slow =  squareDigits(slow);
           fast =  squareDigits(squareDigits(fast));
        }while(fast != slow);
        
        if(slow ==1){
            return true;
        }
        
        return false;
    }
    
    public int squareDigits(int n)
    {   
        int sum = 0;
        //int num =0;
        while(n>0)
        {
          int remainder = n%10;
          n = n/10;
          sum += (remainder* remainder);
        }
        
        return sum;
    }
}
