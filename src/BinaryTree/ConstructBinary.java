package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConstructBinary {

    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        System.out.println("result ::"+buildTree(preorder, inorder));

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root = new TreeNode(preorder[0]);

        List<Integer> leftTree = getLeftTree(0, inorder.length-1, inorder, root);
        if(leftTree.size() > 1){
//            leftTree = getLeftTree(0, inorder.length-1, leftTree, root);
        }
        List<Integer> rightTree = getRightTree(0, inorder.length-1, inorder, root);

        return root;
    }

    public static List<Integer> getLeftTree(int start, int end, int[] inorder, TreeNode root){
        List leftTree = new ArrayList<>();

        while (root.val != inorder[start]){
            leftTree.add(inorder[start]);
            start++;
        }
        System.out.println("left list is :: "+leftTree);
        return leftTree;
    }
    public static List<Integer> getRightTree(int start, int end, int[] inorder, TreeNode root){
        List rightTree = new ArrayList<>();

        while (root.val != inorder[end]){
            rightTree.add(inorder[end]);
            end--;
        }
        System.out.println("right list is :: "+rightTree);
        return rightTree;
    }
}
