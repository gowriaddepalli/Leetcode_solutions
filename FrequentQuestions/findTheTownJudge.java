class Solution {
    public int findJudge(int N, int[][] trust) {
        int arr[] = new int[N+1];
        int rv = -1;
        //System.out.println(trust.length);
       for(int i=0; i< trust.length; i++){
           arr[trust[i][1]]++;
       }
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] == N-1){
                rv = j;
            }
        }
        //System.out.println(rv);
        
       for(int i=0; i< trust.length; i++){
           //System.out.println(trust[i][0]);
           if(trust[i][0] == rv){
               return -1;
           }
       }
            
        return  rv;    
    }
}
