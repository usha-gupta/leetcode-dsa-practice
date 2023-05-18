package BinaryTree;

public class SumofLeftLeaves {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
//        node.left = new TreeNode(9);
//        node.right = new TreeNode(20);
//        node.right.left = new TreeNode(15);
//        node.right.right = new TreeNode(7);

        System.out.println("result :: "+sumOfLeftLeaves(node));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        return sum(root, false);
    }

    public static int sum(TreeNode root, boolean isLeft) {
        if(root == null){
            return 0;
        }
        if(isLeft){
            return root.val;
        }
        return sum(root.left, true) + sum(root.right, false);
    }
}
