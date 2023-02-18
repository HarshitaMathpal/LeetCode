class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();

        inorder(root1,t1);
        inorder(root2,t2);
        
        List<Integer> ans = new ArrayList<>();
        merge(t1,t2,ans);
        return ans;
    }

    public void inorder(TreeNode root,List<Integer> t){
        if(root==null){
            return ;
        }

        inorder(root.left,t);
        t.add(root.val);
        inorder(root.right,t);
    }

    public void merge(List<Integer> t1,List<Integer> t2,List<Integer> ans){
        int i=0,j=0;
        while(i<t1.size() && j<t2.size()){
            if(t1.get(i)<t2.get(j)){
                ans.add(t1.get(i));
                i++;
            }
            else{
                ans.add(t2.get(j));
                j++;
            }
        }
        while(i<t1.size()){
            ans.add(t1.get(i));
            i++;
        }
        while(j<t2.size()){
            ans.add(t2.get(j));
            j++;
        }
    }

}
