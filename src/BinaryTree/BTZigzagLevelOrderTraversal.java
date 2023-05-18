package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTZigzagLevelOrderTraversal {
    public static void main(String[] args) {

//        TreeNode node = new TreeNode(3);
//        node.left = new TreeNode(9);
//        node.right = new TreeNode(20);
//        node.right.left = new TreeNode(15);
//        node.right.right = new TreeNode(7);


        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.right.right = new TreeNode(5);

        System.out.println("result :: "+zigzagLevelOrder(node));

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i =0; i < size; i++){

                TreeNode node = queue.poll();
                if(flag){
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                } else {
                     if(node.right != null){
                         queue.add(node.right);
                     }
                    if(node.left != null){
                        queue.add(node.left);
                    }
                }

                list.add(node.val);
            }
            flag = !flag;
            result.add(list);

        }

    return result;

    }
}
