package BinaryTree;

public class BinaryTree {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode node2 = new TreeNode(1,new TreeNode(1),new TreeNode(3));

        System.out.println("result :: "+isSameTree(node1, node2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null ){
            return true;
        }

        if(q == null || q == null  || p.val != q.val){
            return  false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}


class TreeNode {
      int val;
          TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}