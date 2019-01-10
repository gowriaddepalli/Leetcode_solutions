// What does come to your mind first when you see this sentence "corresponding bits are different"? Yes, XOR! Also, do not forget there is a decent function Java provided: Integer.bitCount() ~~~

public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
