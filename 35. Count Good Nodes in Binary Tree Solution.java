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
    // global variable
    int good;
    public int goodNodes(TreeNode root) {
        good = 0;
        //find goodNode using root and minimum value as firsrt maximum value
        calGoodNodes(root, Integer.MIN_VALUE);
        return good;
    }
    public void calGoodNodes(TreeNode root, int max){
        if(root != null){  // root not to be null
            if(root.val >= max){ // if value greater than max increment good
                good++;
            }
            max = Math.max(max, root.val);   // find maximum value
            calGoodNodes(root.left, max);  // recursive function for all nodes to left
            calGoodNodes(root.right, max); // recursive function for all nodes to right
        }
    }
}
