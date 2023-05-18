package BinaryTree;

public class SymmetricTree {

    public static boolean result;
    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

//        TreeNode node = new TreeNode(1);
//        node.left = new TreeNode(2);
//        node.left.right = new TreeNode(3);
//        node.right = new TreeNode(2);
//        node.right.right = new TreeNode(3);

        System.out.println("result ::: "+isSymmetric(node));
    }

    public static boolean isSymmetric(TreeNode root) {
        result = true;
        compareLeftRightRoot(root.left, root.right);
        return result;
    }

    public static void compareLeftRightRoot(TreeNode leftNode, TreeNode rightNode) {

        if(leftNode == null && rightNode == null) {
            return;
        }

        if((leftNode == null && rightNode != null) || (leftNode != null && rightNode == null)){
            result = false;
            return;
        }

        if((leftNode != null && rightNode != null) && (leftNode.val != rightNode.val)){
            result = false;

        }
        compareLeftRightRoot(leftNode.right, rightNode.left);
        compareLeftRightRoot(leftNode.left, rightNode.right);
    }
}
