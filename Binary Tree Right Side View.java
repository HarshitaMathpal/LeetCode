class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root,ans,0);
        return ans;
    }
    public void rightView(TreeNode root,List<Integer> ans,int currlevel){
        if(root==null)
            return ;
        
        if(currlevel == ans.size()){
            ans.add(root.val);
        }

        rightView(root.right,ans,currlevel+1);
        rightView(root.left,ans,currlevel+1);
    }
}
