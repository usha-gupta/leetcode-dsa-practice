package BinaryTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMode {
    public static Map<Integer, Integer> map;
    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(2);

        System.out.println("resutl :: "+ Arrays.toString(findMode(node)));
    }

    public static int[] findMode(TreeNode root) {
        map = new HashMap<>();
       findModeMap(root);
        int max = Integer.MIN_VALUE;
        int list[] = new int[map.size()];
        int i=0;
        for(Map.Entry<Integer,Integer> item : map.entrySet()){
            if(item.getValue() > max){
                max = item.getValue();
                list[i] = item.getKey();
                i++;
            }
//            else if(item.getValue() == max)
        }
        return list;
    }

    public static void findModeMap(TreeNode root) {
        if(root == null){
            return;
        }
        map.put(root.val, map.getOrDefault(root.val,0)+1);
        findModeMap(root.left);
        findModeMap(root.right);
    }
}
