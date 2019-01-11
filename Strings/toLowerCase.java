class Solution {
    public String toLowerCase(String str) {
         String lower ="";
        for(int i=0; i<str.length(); i++)
        {
            if((int)str.charAt(i)>64 && (int)str.charAt(i)<97)
            {
                lower += String.valueOf((char)(((int)str.charAt(i))+32));
            }else
            {
                lower += String.valueOf(str.charAt(i));
            }
            
        }
        //System.out.println(lower);
        //System.out.println((int)'A');
        //System.out.println((int)'a');
        return lower;
    }
}
