package BinaryTree;

import java.util.*;

public class BTreeLevelOrderTraversal {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        System.out.println("result ::: "+levelOrderBottom(node));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Stack<List<Integer>> stack = new Stack<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i =0; i < size; i++){
                TreeNode node = queue.poll();
                if(node != null && node.left != null){
                    queue.add(node.left);
                }
                if(node != null && node.right != null){
                    queue.add(node.right);
                }
                if(node != null)
                    list.add(node.val);
            }
            stack.add(list);
        }

        int size = stack.size();
        for(int i = 0; i < size; i++){
            result.add(stack.pop());
        }
        return result;
    }
}
