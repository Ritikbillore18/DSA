// Maximum Difference Between Node and Ancestor
class MaxDiffereNodeandAncestor {

    static int helper(TreeNode root, int min, int max){
        if(root==null) return max-min;

        max = Math.max(max,root.val);
        min = Math.min(min,root.val);

        return Math.max(helper(root.left,min,max),helper(root.right,min,max));
    }
    public int maxAncestorDiff(TreeNode root) {
        return helper(root,root.val,root.val);
    }
}