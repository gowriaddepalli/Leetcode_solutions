class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int n = gain.length;
        int alt = 0;
        
        for(int i=0; i<n; i++){
            alt += gain[i];
            if(max < alt){
                max = alt;
            }
        }
        System.out.println(max);
        
        //return ((max>gain[0]) ? (max>0)? max :0 :(gain[0]>0)? gain[0] :0);
        return (max>0? max: 0);
        
    }
}