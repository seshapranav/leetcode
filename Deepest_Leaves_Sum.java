/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int maxdepth=maxDepth(root);
        findsum(maxdepth,1,root);
        return sum;
    }
    public int maxDepth(TreeNode node)
    {
        if(node==null)return 0;
        return 1+Math.max(maxDepth(node.left),maxDepth(node.right));
    }
    public void findsum(int maxdepth,int currpos,TreeNode node){
        if(node!=null)
        {
            if(currpos==maxdepth)
            {
                sum=sum+node.val;
            }
        findsum(maxdepth,currpos+1,node.left);
        findsum(maxdepth,currpos+1,node.right);    
        }

    }
}
