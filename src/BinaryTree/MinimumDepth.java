package BinaryTree;

public class MinimumDepth {

    public static int minCount = Integer.MAX_VALUE;
    public static void main(String[] args) {

//        TreeNode node = new TreeNode(3);
//        node.left = new TreeNode(9);
//        node.right = new TreeNode(20);
//        node.right.left = new TreeNode(15);
//        node.right.right = new TreeNode(7);

        TreeNode node = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(5);
        node.right.right.right.right = new TreeNode(6);

        System.out.println("result :: "+minDepth(node));
    }
    public static int minDepth(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//
//        if(root.left == null && root.right == null) {
//            return 1;
//        }
//        int res = Math.min(minDepth(root.left), minDepth(root.right)) + 1;

        result(root, 1);
        return minCount;
    }

    public static void result(TreeNode root, int count){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && minCount > count){
            minCount = count;
        }
        result(root.left, count+1);
        result(root.right, count+1);
    }


}
