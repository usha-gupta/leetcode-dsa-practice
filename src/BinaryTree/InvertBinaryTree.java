package BinaryTree;

public class InvertBinaryTree {


    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

        System.out.println("result ::: "+invertTree(node));
    }

    public static TreeNode invertTree(TreeNode root) {
            transfer(root.left, root.right);
            return root;
    }

    public static void transfer(TreeNode left, TreeNode right) {

        if(left == null && right == null){
            return;
        }
        TreeNode node = new TreeNode(left.val);
        left = right;
        right = node;
        transfer(left.right, right.right);
        transfer(left.left, right.left);
    }
}
