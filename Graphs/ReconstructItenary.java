class Solution {
    
    Map<String, PriorityQueue<String>> flights;
    LinkedList<String> paths;
    
    public List<String> findItinerary(String[][] tickets) {
        flights = new HashMap<>();
        paths = new LinkedList<>();
        
        for(String[] p: tickets){
            flights.putIfAbsent(p[0], new PriorityQueue<>());
            flights.get(p[0]).add(p[1]);
        }
        dfs("JFK");
        return paths;
    }
    
    public void dfs(String start){
        PriorityQueue<String> pq = flights.get(start);
        while(pq != null && !pq.isEmpty())
            dfs(pq.poll());
            paths.addFirst(start);
    }
    
}
