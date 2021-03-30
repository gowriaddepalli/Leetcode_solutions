class OrderedStream {
    
    private int n;
    private int index=0;
    private String[] stream;

    public OrderedStream(int n) {
        this.n = n;
        this.stream = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        this.stream[idKey-1] = value;
        List<String> return_list = new ArrayList<>();
        while(index<n && stream[index]!= null){
            return_list.add(stream[index]);
            index++;
        }
        
        return return_list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
