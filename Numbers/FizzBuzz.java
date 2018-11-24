class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> ar = new ArrayList<String>();
        
        for(int i=1; i<=n; i++){
            
            if(i%3 == 0 && i%5 == 0){
                ar.add("FizzBuzz");
            }
            
            if(i%3== 0 && i%5 != 0){
                ar.add("Fizz");
            }
            
            if(i%3 != 0 && i%5 == 0){
                ar.add("Buzz");
            }
            
            if(i%3 != 0 && i%5 != 0){
                ar.add(Integer.toString(i));
            }
            
        }
        return ar;
    }
}
