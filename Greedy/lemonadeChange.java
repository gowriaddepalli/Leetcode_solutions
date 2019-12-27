class Solution {
public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        
        for(int i : bills)
        {
            if(i == 5)
            {
                fiveCount++;
            }
            else if(i == 10)
            {
                tenCount++;
                if(fiveCount == 0)
                {
                    return false;
                }
                
                fiveCount--;
            }
            else
            {
                if(tenCount != 0)
                {
                    tenCount--;
                    if(fiveCount != 0)
                    {
                        fiveCount--;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(fiveCount < 3)
                    {
                        return false;
                    }
                    
                    fiveCount -= 3;
                }
            }
        }
        
        return true;
    }
}
