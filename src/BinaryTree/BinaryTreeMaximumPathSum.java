package BinaryTree;

public class BinaryTreeMaximumPathSum {
    public static int maxSum;
    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right  = new TreeNode(3);

        System.out.println("result is : "+maxPathSum(node));

    }

    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        getHeigh(root);
        return maxSum;
    }

    public static int getHeigh(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSum = Math.max(0, getHeigh(root.left));
        int rightSum = Math.max(0, getHeigh(root.right));

        maxSum =  Math.max(maxSum, leftSum+rightSum+root.val);

        return (root.val + Math.max(leftSum, rightSum));
    }
}
