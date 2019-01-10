class Solution {
    public int hammingDistance(int x, int y) {
        String stX = Integer.toBinaryString(x);
        String stY = Integer.toBinaryString(y);
        System.out.println(stX);
        System.out.println(stY);
        int min=0;
        int max = 0;
        int count = 0;
        String minString = stX;
        String maxString = stY;
        int zerosAppend =0;
        String zeroa = "";
        
        if(stX.length() > stY.length())
        {
           min =  stY.length();
           max =  stX.length();
           minString = stY;
           maxString = stX;
        }
        
        if(stX.length() < stY.length())
        {
           min =  stX.length();
           max =  stY.length();
           minString = stX;
           maxString = stY;
        }
        
        zerosAppend = max -min;
        
        for(int i=0; i<zerosAppend; i++)
        {
            zeroa += "0";
        }
        
        minString = zeroa + minString ;
        
        for(int i=0; i<minString.length(); i++)
        {
            if(minString.charAt(i) != maxString.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}
