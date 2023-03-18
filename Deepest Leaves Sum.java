class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();

        if(root==null)
            return 0;

        que.add(root);
        int sum = 0;

        while(!que.isEmpty()){
            int size = que.size();
            sum = 0;
            while(size-->0){
                TreeNode currnode = que.remove();
                sum += currnode.val;

                if(currnode.left!=null)
                    que.add(currnode.left);
                
                if(currnode.right!=null)
                    que.add(currnode.right);
            }
        }

        return sum;
    }
}
