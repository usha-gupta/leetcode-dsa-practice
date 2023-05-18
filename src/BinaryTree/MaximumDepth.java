package BinaryTree;

public class MaximumDepth {
    public static int count =0;
    public static void main(String[] args) {
//          TreeNode node = new TreeNode(1);
//          node.right = new TreeNode(2);

        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);


        System.out.println("result ::: "+maxDepth(node));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftCount = maxDepth(root.left);
        int rightCount = maxDepth(root.right);
        return leftCount > rightCount ? ++leftCount : ++rightCount;
    }
}
