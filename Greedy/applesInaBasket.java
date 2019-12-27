class Solution {
    public int maxNumberOfApples(int[] arr) {
        
        int count =0;
        int i=0;
        int sum =5000;
        Arrays.sort(arr);
        while(i<arr.length && sum- arr[i] >=0){
            sum -= arr[i];
            i++;
            count++;
        }
        return count;
    }
}
