class Solution 
{
    public int numJewelsInStones(String J, String S) 
    {
        int [] map = new int[256];
        int count = 0;
        for (char c: J.toCharArray())
        {
            map[c]++;
        }
        for (char c: S.toCharArray())
        {
            if (map[c] > 0)
            {
                count++;
            }
        }
        return count;
    }
}
