package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofBT {
    public static void main(String[] args) {

    }
    public static int widthOfBinaryTree(TreeNode root) {

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        int maxWidth =0;

        while(! queue.isEmpty()){
            int size = queue.size();
            int last =0, first =0;
            for(int i = 0; i < size; i++){
                Pair pare = queue.poll();
                int currentIndex = pare.index;
                first = (i == 0) ? pare.index : first;
                last = (i == size-1) ? pare.index : last;
                if(pare.node.left != null){
                    queue.add(new Pair(pare.node.left,currentIndex*2+1));
                }
                if(pare.node.right != null){
                    queue.add(new Pair(pare.node.right,currentIndex*2+2));
                }

            }
            maxWidth = Math.max(maxWidth, last-first+1);
        }
        return maxWidth;
    }


}

class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}