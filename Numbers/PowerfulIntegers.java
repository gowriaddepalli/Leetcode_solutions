class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> seen = new HashSet();
        // run i and j oly upto 18 as later all numbers will be more than 10^6.
        for(int i=0; i<18 && Math.pow(x,i) <= bound; i++)
        {
            for(int j=0; j<18 && Math.pow(y,j) <= bound; j++)
            {
                if(((int) Math.pow(x, i) + (int) Math.pow(y, j)) <= bound){
                    seen.add((int) Math.pow(x, i) + (int) Math.pow(y, j));
                }
            }
        }
       return new ArrayList(seen); 
    }
}
