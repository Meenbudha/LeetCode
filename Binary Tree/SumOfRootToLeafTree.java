
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }    
}
public class SumOfRootToLeafTree{

    public static int sumRootToLeaf(TreeNode root){
        return dfs(root, 0);
    }
    public static int dfs(TreeNode node, int curr){
        if(node == null) return 0;
        // curr = curr * 2 + node.val;
        curr = (curr << 1) | node.val;

        if(node.left == null && node.right == null){
            return curr;
        }
        return dfs(node.left, curr) + dfs(node.right, curr);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        int result = sumRootToLeaf(root);
        System.out.println("Sum of root-to-leaf pahts: " + result);
    }
}