// Leaf-Similar Trees
class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Helper function to traverse the tree and collect leaf node values
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        // Populate lists with leaf values using the helper function
        checkLeaf(root1, ans1);
        checkLeaf(root2, ans2);

        // Check if the leaf sequences for both trees are equal
        return ans1.equals(ans2);
    }

    // Helper function to traverse the tree and collect leaf node values
    private void checkLeaf(TreeNode root, List<Integer> ans) {
        // Base case: If the node is null, return
        if (root == null) {
            return;
        }

        // Recursively check the left subtree
        checkLeaf(root.left, ans);

        // If the node is a leaf (both left and right children are null), add its value to the list
        if (root.left == null && root.right == null) {
            ans.add(root.val);
        }

        // Recursively check the right subtree
        checkLeaf(root.right, ans);
    }
}
