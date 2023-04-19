class Solution {
    static int maxstep = 0;
    public int longestZigZag(TreeNode root) {

        if(root==null)
            return -1;
        
        maxstep=0;
        helper(root.left,1,false);
        helper(root.right,1,true);
        
        return maxstep;
    }

    public void helper(TreeNode root,int step,boolean isRight){
        if(root==null)
            return;
        
        maxstep = Math.max(step,maxstep);

        if(isRight){
            helper(root.left,step+1,false);                                  //right call -> left call
            helper(root.right,1,true);                                       //rightcall -> right call
        }
        else{
            helper(root.right,step+1,true);                                  //leftcall -> right call
            helper(root.left,1,false);                                       //leftcall -> leftcall
        }

        return;
    }

}
