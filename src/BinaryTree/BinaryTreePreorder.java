package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorder {
    public static List<Integer> list;
    public static void main(String[] args) {
          TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);

        list = new ArrayList<>();
        System.out.println("result ::: "+preorderTraversal(node));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
