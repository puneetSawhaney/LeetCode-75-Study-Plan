// code by Puneet 
// please visit to explanation file of this code to understand the approach

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
    public int maxDepth(TreeNode root) {
        // if root is null then return 0;
        if(root == null){
            return 0;
        }
        // we go deep inside to it's left, then to it's right & from there we will get the deepest root to child value of it's left & right
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
// compare both of them which one has the greatest value will be added to 1, as root will count as well
        return Math.max(left, right)+ 1;
    }
}
