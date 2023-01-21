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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        boolean left = true;
        Queue<TreeNode> queue= new LinkedList<>();
        List<List<Integer>>temp= new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tarp = new ArrayList<>();
            while (size != 0) {
                TreeNode currentnode = queue.remove();
                tarp.add(currentnode.val);

                if (currentnode.left != null) {
                    queue.add(currentnode.left);
                }
                if (currentnode.right != null) {
                    queue.add(currentnode.right);
                }
                size--;
            }

            if (!left) {
                Collections.reverse(tarp);
            }
            left = !left;
            temp.add(tarp);
        }
    
    return temp;
    }
}
