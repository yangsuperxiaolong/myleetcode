package problem;

/**
 * 108. 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * <p>
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
public class Problem_108 {
    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println("complete");
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return createTree(nums,0,nums.length-1);
    }



    public static TreeNode createTree(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid = (left + right +1)/2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = createTree(nums,left,mid-1);
        node.right = createTree(nums,mid+1,right);

        return node;
    }
}

