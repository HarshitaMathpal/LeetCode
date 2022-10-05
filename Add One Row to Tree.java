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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newnode = new TreeNode(val);
            newnode.left = root;
            return newnode;
        }
        
        insertnode(root,val,depth,1);
        
        return root;
    }
    
    public void insertnode(TreeNode node, int val, int depth,int currd){
        if(node == null)
            return;
        
        if(currd == depth-1){
            TreeNode left = node.left;
            TreeNode right = node.right;
            node.left = new TreeNode(val);
            node.right = new TreeNode(val);
            node.left.left = left;
            node.right.right = right;
            return;
        }
        insertnode(node.left, val, depth,currd+1);
        insertnode(node.right, val,depth,currd+1);
    }
}
