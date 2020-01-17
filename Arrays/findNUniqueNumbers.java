class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for(int i=0;i<n/2; i++)
        {
            arr[i] = -(i+1);
            arr[i+n/2]= i+1;
        }
        if(n%2 ==1)
        {
            arr[n-1] = 0;
        }
        
        return arr;
    }
}
