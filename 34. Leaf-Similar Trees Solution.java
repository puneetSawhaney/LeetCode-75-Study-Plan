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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // create two lists two hold the leaf nodes
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        // function to get the leaf nodes for both root1 and root2
        getLeafs(root1, list1);
        getLeafs(root2, list2);

        return list1.equals(list2);
    }
    public void getLeafs(TreeNode node, List<Integer> list){
        if(node != null){  // node should not be null
        // if node.left and ndde.right is null it means current node is leaf node
            if(node.left == null && node.right == null){
                // add it to list
                list.add(node.val);
            }
            // recursion to get leaf nodes for both left and right elements
            getLeafs(node.left, list);
            getLeafs(node.right, list);
        }
    }
}
