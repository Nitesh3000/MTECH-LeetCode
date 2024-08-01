class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSumBST(root, low, high, 0);
    }

    public int rangeSumBST(TreeNode root, int low, int high, int sum) {
        if (root == null) {
            return sum;
        }
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.left != null) {
            sum = rangeSumBST(root.left, low, high, sum);
        }
        if (root.right != null) {
            sum = rangeSumBST(root.right, low, high, sum);
        }
        return sum;
    }
}

public class RangeSumofBST{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        Solution solution = new Solution();

        int low = 7;
        int high = 15;
        int sum = solution.rangeSumBST(root, low, high);
        System.out.println("Sum of values in range [" + low + ", " + high + "] is: " + sum);
    }
}
