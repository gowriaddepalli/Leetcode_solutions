class Solution {
     public int dayOfYear(String date) {
        int y=Integer.parseInt(date.substring(0, 4));
        int m=Integer.parseInt(date.substring(5, 7));
        int res=Integer.parseInt(date.substring(8));
        if(y%4==0&&y%100!=0&&m>2&&res!=29) res++;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<m-1;i++) res+=days[i];
        return res;
    }
}
