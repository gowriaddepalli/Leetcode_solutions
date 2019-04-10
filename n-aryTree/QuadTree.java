/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution {
    public Node construct(int[][] grid) {
     return buildTree(0, grid.length-1, 0, grid.length-1, grid);   
    }
    
    public Node buildTree(int r1, int r2, int c1, int c2, int[][]g){
        // exit condition
        if(r1> r2 || c1> c2){
            return null;
        }
        
        boolean isLeaf = true;
        int val = g[r1][c1];
        // base case
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++ ){
                if(val != g[i][j]){
                   isLeaf = false;
                    break;
                }
            }
        }
        
        
        if(isLeaf){
            return new Node(val == 1, true, null, null, null, null);
        }
        int rowmid = (r1+ r2)/2;
        int colmid = (c1+ c2)/2;
        
        return new Node(false, false, 
                        // top left
                       buildTree(r1, rowmid, c1, colmid, g),
                        // top right
                       buildTree(r1, rowmid, colmid+1, c2,g),
                        // bottom left
                       buildTree(rowmid+1, r2, c1, colmid, g),
                        // bottom right
                       buildTree(rowmid+1, r2, colmid+1, c2,g));
        
    }
}
