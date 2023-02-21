class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null){
            return false;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        boolean even=true;
        while(!queue.isEmpty()){
            int currentsize=queue.size();
            int preVal=even?Integer.MIN_VALUE:Integer.MAX_VALUE;
            while(currentsize-->0){
                TreeNode currentNode= queue.remove();
                if(even && (currentNode.val % 2 == 0 || currentNode.val <= preVal))
                {
                    return false;
                }
                if(!even && (currentNode.val % 2 == 1 ||currentNode.val >= preVal)){
                    return false; 
                }
                preVal = currentNode.val;
                if(currentNode.left != null){
                    queue.add(currentNode.left); 
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right); 
                }
            }
            even=!even;
            }
            return true;
    }
}
