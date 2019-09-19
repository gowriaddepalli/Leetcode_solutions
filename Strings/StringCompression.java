class Solution {
    public int compress(char[] chars) {
        
        int sum =0;
        int n = chars.length;
        int j =0;
        int p =0;
        for(int i=0; i<chars.length-1; i++){
           if(chars[i+1] == chars[i]){
               p = i;
               sum++;
           }else{
               chars[j++] = chars[i];
               //System.out.println(chars[j-1]);
               p = i;
               if(sum>0)
               {
                 for (char c: ("" + (sum+1)).toCharArray()) {
                        chars[j++] = c;
                    }
               //System.out.println(chars[j-1]);
               sum =0;  
               }
               
           } 
        }
        if(j+1<chars.length){
           chars[j++] = chars[n-1];
            if(sum>0){
                for (char c: ("" + (sum+1)).toCharArray()) {
                        chars[j++] = c;
                    }
            }
        }else{
           return n;
        } 
       return j; 
    }
}
