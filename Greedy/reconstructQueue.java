class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o1[0] == o2[0] ? o1[1] -o2[1] : o2[0]-o1[0];
            }
        });
        
        List<int[]> op = new LinkedList<>();
        for(int[] p : people){
            op.add(p[1],p);
        }
        
        int n = people.length;
        return op.toArray(new int[n][2]);
    }
}
