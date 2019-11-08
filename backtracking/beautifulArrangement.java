class Solution {
    
    int num;
    int counter;
    int[] buffer;
    
    public int countArrangement(int N) {
        num = N;
        buffer = new int[N];
        
        for(int i=0; i<N; i++){
            buffer[i] = i+1;
        }
        // dfs starting from zero.
        dfs(0);
        return counter;
    }
    
    public void dfs(int depth){
        // when the permutations reach the leaf node, that is the exit condition.
        if(depth == num) counter++;
        // recursive call from a certain depth.
        for(int j= depth; j<num; j++){
            //for bringing all permutations.
            swap(depth,j);
            if(buffer[depth]%(depth+1) ==0 || (depth+1)%buffer[depth] ==0){
                dfs(depth+1);
            }
            // restoring back post all recursions.
            swap(j,depth);
        }
    }
    
    public void swap(int i, int j){
       int temp = buffer[i];
        buffer[i] = buffer[j];
        buffer[j] = temp;
    }
}
