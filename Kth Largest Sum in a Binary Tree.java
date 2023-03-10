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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> al = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);

        while(!que.isEmpty()){
            // long currsum = 0;
            int size = que.size();

            long currsum = 0;
            for(int i=0;i<size;i++){
                TreeNode currnode = que.remove();
                currsum += currnode.val;

                if(currnode.left != null){
                    que.add(currnode.left);
                }
                if(currnode.right != null){
                    que.add(currnode.right);
                }
            }

            al.add(currsum);
        }
        Collections.sort(al);

        if(al.size()<k){
            return -1;
        }

        return al.get(al.size()-k);
    }
}
