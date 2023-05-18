package BinaryTree;

import java.util.ArrayList;

public class ConstructBST {
    public static void main(String[] args) {

        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        System.out.println("result ::: "+buildTree(inorder, postorder));
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        return makeTree(inorder, new TreeNode(postorder[postorder.length-1]), 0, inorder.length);

    }

    public static TreeNode makeTree(int[] inOrder, TreeNode root, int start, int end){
        if(start > end) {
            return null;
        }
        int mid=0;
        for(int i =0; i < inOrder.length; i++){
            if(inOrder[i] == root.val){
                root = new TreeNode(inOrder[i]);
                mid = i;
                break;
            }
        }

        root.left = makeTree(inOrder, root.left, start, mid-1);
        root.right = makeTree(inOrder, root.left, mid+1, end);
        return root;
    }
}
