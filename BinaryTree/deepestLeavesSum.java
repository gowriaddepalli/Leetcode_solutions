class Solution {
static int sum=0;

public int deepestLeavesSum(TreeNode root) {
    int max=maxSize(root);
    sum=0;
    sumAll(root,max,1);
    return sum;
    
}


public int maxSize(TreeNode root)
{
    if (root==null)
        return 0;
    else
        return Math.max(maxSize(root.left),maxSize(root.right))+1;
}

public void sumAll(TreeNode root, int max,int level)
{
    if(root==null)
        return;
    if(level==max)
        sum+=root.val;
    
    level++;
    sumAll(root.left,max,level);
    sumAll(root.right,max,level);
}
}
