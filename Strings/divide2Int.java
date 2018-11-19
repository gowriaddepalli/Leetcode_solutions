class Solution {
   // Divide two integers without mod. mult, divide.
   // Lesson: Use Long datatype when adding two integers which may exceed buffer.
   
   
   public int divide(int dividend, int divisor) {
        int quotient = 0;
        int did = 0;
        int dividendnew = 0;
        
        if (dividend == Integer.MIN_VALUE){
            if (divisor == -1){
                return Integer.MAX_VALUE;
            }
            
            if (divisor == 1){
                return Integer.MIN_VALUE;
            } 
            
            dividendnew = dividend + Math.abs(divisor);
            //System.out.println(dividendnew);
	        did =1;
        }
        
        if (divisor == Integer.MIN_VALUE)
        {
	        if(dividend == Integer.MAX_VALUE)
            {
              return 0;  
            }
            divisor = Integer.MIN_VALUE + 1;
            //did=1;
	    }
        
        if((did != 1) && (Math.abs(dividend)< Math.abs(divisor)))
        {
	        	return 0;
	    }
        
        
        if(dividend> 0 && divisor>0 )
        {
            quotient = getTimes(dividend, divisor);
        }
        else if(dividend<0 && divisor<0)
        {
            if(did ==1) {
                quotient = getTimes(Math.abs(dividendnew), Math.abs(divisor));
	            //System.out.println("hr");	
                quotient = quotient+1;
		        }else{
                //System.out.println("h");
                quotient = getTimes(Math.abs(dividend), Math.abs(divisor));
            }
        }
        else if(dividend>0 && divisor<0)
        {
            quotient = getTimes(dividend, Math.abs(divisor));
            quotient = -quotient;
        }
        else if(dividend<0 && divisor>0){
            
            if(did == 1) {
                    quotient = getTimes(Math.abs(dividendnew),divisor);
                    quotient = -quotient;
	            	quotient = quotient-1;
		        }else{
                quotient = getTimes(Math.abs(dividend),divisor);
                quotient = -quotient;
            }
        }
      return quotient;
    }
    
    public int getTimes(int div, int divis)
    {
        int sum = 0;
        int i = 0;
        long divis2 = (long)divis + (long)divis;
        long divis3 = (long)divis + (long)divis + (long)divis;
        long divis4 = (long)divis + (long)divis + (long)divis + (long)divis;
        
        //System.out.println("cj");
       while(((long)div -(long)sum)>= divis4)
	            {
	                //System.out.println("in loop 4");
                    i =i +4;
	                sum += divis;
	                div = (int) ((long)div -divis3);
	            }
        
         //System.out.println(divis);
         while(((long)div -(long)sum)>= divis3)
	            {
	                //System.out.println("in loop 3");
                    i =i +3;
	                sum += divis;
	                div = (int)((long)div -divis2);
	            }
        
        while(((long)div -(long)sum)>= (divis2))
	            {
	                //System.out.println("in loop 2");
                    i =i +2;
	                sum += divis;
                    div = (int)((long)div -(long)divis);
	               // div = div -divis;
	            }
	    while((div -sum)>= (divis))
            {
                i =i +1;
                sum += divis;
                //div = div -sum;
            }
        
        return i;
    }
}
