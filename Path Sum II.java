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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        findpath(root,targetSum,temp,ans);
        return ans;
    }
    
    public static void findpath(TreeNode root,int targetsum,List<Integer> temp,List<List<Integer>> ans){                 
        if(root == null)                        //if root not exist simply return.
            return;
        
        if(root.left == null && root.right == null){             //if node is a leaf node
            if(targetsum - root.val == 0){                //if targetsum - val = 0 means leaf node gives answer.
                List<Integer> base = new ArrayList<>(temp);
                base.add(root.val);
                ans.add(base);
            }
            return;                     //if leaf node not include in the answer simple return.
        }
        
        temp.add(root.val);
        
        findpath(root.left,targetsum-root.val,temp,ans);
        findpath(root.right,targetsum-root.val,temp,ans);
        
        temp.remove(temp.size()-1);
        
        return;
    }
    
}
