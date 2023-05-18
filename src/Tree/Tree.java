package Tree;

import java.util.*;

public class Tree {

    private TreeNode root;

    Tree(TreeNode root) {
        this.root = root;
    }

    void print() {
        printTree(this.root);
    }

    public void printTree(TreeNode root) {

        while(root != null){
            System.out.println(root.getValue());
            List<TreeNode> children = root.getChildren();
            int i = 0;
            while (i < children.size()) {
                printTree(children.get(i));
                i++;
            }
        }
    }




}

class BinaryTree {
    private BinaryTreeNode root;
    void print() {
        printBinaryTree(this.root);
    }

    private void printBinaryTree(BinaryTreeNode root) {
        while(this.root != null) {
            System.out.println(this.root.getValue());
            printBinaryTree(this.root.getLeft());
            printBinaryTree(this.root.getRight());
        }
    }

}

class TreeNode {

    private int value;
    private List<TreeNode> children;

    public int getValue() {
        return value;
//        Set<Integer> set = new HashSet<>();


    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}

class BinaryTreeNode {

    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }
}
