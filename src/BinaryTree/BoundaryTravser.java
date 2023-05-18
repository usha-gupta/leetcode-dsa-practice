package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BoundaryTravser {
    public static void main(String[] args) {

        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(8);
        node.left.right.left = new TreeNode(7);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(18);
        node.right.right = new TreeNode(25);


//        System.out.println("result ::: "+traverseBoundary(node));
        System.out.println("result ::: "+getLeftBoundary(node.left, new ArrayList<Integer>()));
    }

//    public static ArrayList<Integer> traverseBoundary(TreeNode root){
//        // Write your code here.
//
//
//
//
//
//    }

    public static ArrayList<Integer> getLeftBoundary(TreeNode root, ArrayList<Integer> arrayList){
        TreeNode currentNode = root;
        while(currentNode != null) {
            if (!isLeaf(currentNode)) {
                arrayList.add(currentNode.val);
            } if (currentNode.left != null) {
                arrayList.add(currentNode.val);
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        System.out.println("result :: "+arrayList);
        return arrayList;
    }

    public static boolean isLeaf(TreeNode root){
        return root.left == null  && root.right == null;
    }
}
