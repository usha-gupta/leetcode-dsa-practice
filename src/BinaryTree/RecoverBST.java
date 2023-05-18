package BinaryTree;

public class RecoverBST {

    public static TreeNode prev =null, first= null, second = null;
    public static void main(String[] args) {

        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node.right.left = new TreeNode(2);

        print(node);
        System.out.println();
        recoverTree(node);
        print(node);

    }

    public static void print(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ->");
        print(root.left);
        print(root.right);
    }

    public static void recoverTree(TreeNode root) {
        changeUpdate(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public static void changeUpdate(TreeNode root){
        if(root == null){
            return;
        }
        changeUpdate(root.left);
        if(prev != null && prev.val > root.val){
            if(first == null){
                first = prev;
            }
            second = root;
        }
        prev = root;
        changeUpdate(root.right);
    }
}
