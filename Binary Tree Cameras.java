

class Solution {
    int count=0;
    public int minCameraCover(TreeNode root) {
        int c=CountCamera(root);
        if(c==-1){
            count++;
        }
        return count;
    }

    public int CountCamera(TreeNode root){
        if(root==null){
            return 1;
        }
        int left=CountCamera(root.left);
        int right=CountCamera(root.right);

        if(left==-1 || right==-1){
            count++;
            return 2;
        }
        if(left==1 && right==1){
            return -1;
        }
        else{
            return 1;
        }

    }
}
