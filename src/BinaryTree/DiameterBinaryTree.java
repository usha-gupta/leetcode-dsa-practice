package BinaryTree;

public class DiameterBinaryTree {
    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);


        System.out.println("result :: "+diameterOfBinaryTree(node));


    }

    public static int max = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return max;
    }

    public static void findMax(TreeNode root){
        if(root == null){
            return;
        }
        int leftHeigh = checkHiegh(root.left);
        int rightHeigh = checkHiegh(root.right);

        max = Math.max(max,(leftHeigh + rightHeigh));
        findMax(root.left);
        findMax(root.right);
    }
    public static int checkHiegh(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(checkHiegh(root.left),checkHiegh(root.right));
    }
}
