package BinaryTree;

public class PathSum {

    public static int target = 0;

    public static void main(String[] args) {
//        TreeNode node = new TreeNode(5);
//        node.left = new TreeNode(4);
//        node.left.left = new TreeNode(11);
//        node.left.left.left = new TreeNode(7);
//        node.left.left.right = new TreeNode(2);
//        node.right = new TreeNode(8);
//        node.right.left = new TreeNode(13);
//        node.right.right = new TreeNode(4);
//        node.right.right.right = new TreeNode(1);


        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);

        System.out.println("result :::: "+hasPathSum(node, 22));

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return result(root, 0);
    }

    public static boolean result(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        sum = sum + root.val;
        if(sum == target && root.left == null && root.right == null){
            return true;
        }
        return result(root.left, sum) || result(root.right, sum);
    }
}
