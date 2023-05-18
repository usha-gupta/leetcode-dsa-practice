package BinaryTree;

public class BalancedBinaryTree {
    
    public static boolean result = true;
    public static  int rightCount = 0;

    public static void main(String[] args) {
//
//        TreeNode node = new TreeNode(3);
//        node.left = new TreeNode(9);
//        node.right = new TreeNode(20);
//        node.right.left = new TreeNode(15);
//        node.right.right = new TreeNode(7);

//        TreeNode node = new TreeNode(1);
//        node.right = new TreeNode(2);
//        node.right.right = new TreeNode(3);



        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(3);

        node.left.left.left = new TreeNode(4);
        node.left.left.right = new TreeNode(4);

        System.out.println("result ::::: "+isBalanced(node));


    }

    public static boolean isBalanced(TreeNode root) {

        getCount(root);
        return result;

    }

     public static int getCount(TreeNode root) {
         if(root == null ) {
             return 0;
         }
         int leftCount = getCount(root.left);
         int rightCount = getCount(root.right);
         int diff =  Math.abs(leftCount - rightCount);
         if(diff > 1) {
             result = false;
         }
         return Math.max(leftCount,rightCount) + 1;
     }

}
