package BinaryTree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    static List<String> list;
    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(5);

        System.out.println("result ::: "+binaryTreePaths(node));

    }

    public static List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<>();
         getRoute(root, "");
        System.out.println("list is :: "+list);
        return list;
    }

    public static void  getRoute(TreeNode root, String str) {
        if(root == null) {
            return;
        }
        System.out.println("str sixe : "+str.length()+" str ::: "+str);
        if(str.length() <= 0){
            str  = str.concat(String.valueOf(root.val));
        } else{
            str  = str.concat("->").concat(String.valueOf(root.val));
        }

        if(root.left == null && root.right == null){
            list.add(str);
        }
        getRoute(root.left, str);
        getRoute(root.right, str);
    }
}
