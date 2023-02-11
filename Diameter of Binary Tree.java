class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diam = new int[1];
        findDiameter(root,diam);
        return diam[0];
    }

    public int findDiameter(TreeNode root,int[] diam){
        if(root==null)
            return 0;
        
        int leftDiam = findDiameter(root.left,diam);
        int rightDiam = findDiameter(root.right,diam);

        diam[0] = Math.max(leftDiam+rightDiam,diam[0]);
        return 1 + Math.max(leftDiam,rightDiam);
    }
}
