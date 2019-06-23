class Solution {
    public boolean judgeCircle(String moves) {
        int sum = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                sum += 1;
            }
            if(moves.charAt(i) == 'D'){
                sum -= 1;
            }
            if(moves.charAt(i) == 'L'){
                sum += 2;
            }
            if(moves.charAt(i) == 'R'){
                sum -= 2;
            }
        }
        
        return ((sum == 0) ? true : false);
    }
}
