class Solution {
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        findpath(root,"",al);
        int sum = 0;
        for(int i:al){
            sum += i;
        }
        return sum;
    }
    public void findpath(TreeNode root,String path,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        path += root.val;
        if(root.left==null && root.right==null){
            al.add(Integer.parseInt(path));
            return;
        }
        findpath(root.left,path,al);
        findpath(root.right,path,al);

    }
}
