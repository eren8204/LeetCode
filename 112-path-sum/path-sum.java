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
    public int sum=0;
    public boolean doesIT(TreeNode root, int targetSum){
        if(root==null)
            return false;
        sum+=root.val;
        boolean l=false,r=false;
        if(root.left==null && root.right==null){
            int temp = sum;
            sum -= root.val;
            if(temp==targetSum)
                return true;
        }
        else{
            l = doesIT(root.left,targetSum);
            r = doesIT(root.right,targetSum);
            sum-=root.val;
        }
        return l || r;

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return doesIT(root,targetSum);
    }
}