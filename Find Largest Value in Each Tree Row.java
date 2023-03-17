class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>answer=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        if(root==null){
            return answer;
        }
        while(!queue.isEmpty()){
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            while(size-->0){
                TreeNode currentNode=queue.remove();
                max=Math.max(max,currentNode.val);

                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }
            answer.add(max);
        }

        return answer;
    }
}
