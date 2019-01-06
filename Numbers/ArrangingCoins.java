class Solution {
    public int arrangeCoins(int n) {
        int i =1;
        while(n>0)
        {
            n= n-i;
            i++;
        }
        if(n<0){
            return i-2;
        }
        if(n==0){
            return i-1;
        }
        return i;
    }
}


// one more method.
 public int arrangeCoins(int n) {
        return (int) ((Math.sqrt(1+8L*n)-1) / 2); 
    }
