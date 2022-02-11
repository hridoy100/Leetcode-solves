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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null); 
        // Not a good practice to use INT.MIN and INT.MAX
        // null denotes both negative and positive infinity
    }
    
    public boolean isValid(TreeNode node, Integer low, Integer high){
        if(node == null) return true;
        if((low!=null && node.val <= low) || (high!=null && node.val >= high)) {return false;}
        return isValid(node.left, low, node.val) && isValid(node.right, node.val, high);
    }
    
    //Time O(N)
    // Space O(N)
    /*
           4
          /
         3
        /
       2
      /
     1
     
     When the tree is scured, it takes O(N) space..
   */
}