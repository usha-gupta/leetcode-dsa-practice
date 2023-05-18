package BinaryTree;

public class SecondMinimumNodeBT {
    public static int firstMin;
    public static int secondMin;
    public static void main(String[] args) {

        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(2);
        node.right = new TreeNode(5);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(7);

        System.out.println("result :: "+findSecondMinimumValue(node));
    }

    public static int findSecondMinimumValue(TreeNode root) {
        firstMin = Integer.MAX_VALUE;
        secondMin = Integer.MAX_VALUE;
        travse(root);
        return secondMin;
    }
    public static void travse(TreeNode root){
        if(root == null){
            return;
        }
        if(root.val < firstMin){
            secondMin = firstMin;
            firstMin = root.val;
        } else if(root.val < secondMin && firstMin != root.val) {
            secondMin = root.val;
        }
        travse(root.left);
        travse(root.right);
    }
}
