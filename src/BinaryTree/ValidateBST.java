package BinaryTree;

public class ValidateBST {
    public static Boolean result;

    public static void main(String[] args) {

//        TreeNode node = new TreeNode(2);
//        node.left = new TreeNode(2);
//        node.right = new TreeNode(2);


        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(6);

        System.out.println("result ::: "+isValidBST(node));
        int a = Integer.MIN_VALUE;

    }

    public static boolean isValidBST(TreeNode root) {
        result = true;
        checkVaild(root);
        return result;
    }

    public static void checkVaild(TreeNode root){
        if(root == null){
            return;
        }
        else if((root.left != null && root.left.val >= root.val) || (root.right != null && root.right.val <= root.val)){
            result = false;
        }
        checkVaild(root.left);
        checkVaild(root.right);
    }
}
