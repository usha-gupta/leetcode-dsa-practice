package BinaryTree;

public class ConvertSortedArray {
    public static void main(String[] args) {

        int[] nums = new int[]{-10,-3,0,5,9};
        System.out.println("result ::: "+sortedArrayToBST(nums));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        System.out.println("len :: "+nums.length);
        TreeNode node = makeTree(nums,0, nums.length-1);
        return makeTree(nums,0, nums.length-1);
    }

    public static TreeNode makeTree(int[] nums, int start, int end) {
        if(start > end){
            return null;
        }
        int mid = start + ((end - start) / 2);
        TreeNode node =  new TreeNode(nums[mid]);
        node.left = makeTree(nums, start, mid-1);
        node.right = makeTree(nums,mid+1, end);
        return node;
    }
}
