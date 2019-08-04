class Solution {
    public String reverseOnlyLetters(String S) {
       int n = S.length();
       int i=0;
       int j = n-1;
      // char temp = '';
       char p[] = S.toCharArray();
        
        //System.out.println((int)('A'));
        //System.out.println((int)('Z'));
        //System.out.println((int)('a'));
        //System.out.println((int)('z'));
        
        
        while(i<j){
            //System.out.println((int)(S.charAt(i)));
            //System.out.println((int)(S.charAt(j)));
            if(((S.charAt(i)>64 && S.charAt(i)<91) || (S.charAt(i) >96) &&(S.charAt(i)<123)) &&((S.charAt(j)>64 && S.charAt(j)<91) || (S.charAt(j) >96) &&(S.charAt(j)<123))){   
         //System.out.println(S.charAt(i));
         //System.out.println(S.charAt(j));
                
         char temp = S.charAt(i);
          p[i] = S.charAt(j);
          p[j] = temp;
                i++;
                j--;
                
}else if(!((S.charAt(i)>64 && S.charAt(i)<91) || (S.charAt(i) >96) &&(S.charAt(i)<123)))
        {
                i++;
        }
 else if(!((S.charAt(j)>64 && S.charAt(j)<91) || (S.charAt(j) >96) &&(S.charAt(j)<123)))
        {
                j--;
        }
        }
        
        return new String(p);
    }
}
