package problem;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_112 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        TreeNode node13 = new TreeNode(13);
        TreeNode node42 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node11.left = node7;
        node11.right = node2;
        node42.right = node1;

        node4.left = node11;
        node8.left = node13;
        node8.right = node42;

        root.left = node4;
        root.right = node8;

        hasPathSum(root,22);



    }
    public static boolean hasPathSum(TreeNode root, int sum) {
        boolean result = hasPathSum1(root,sum,0,false);
        return result;

    }

    public static boolean hasPathSum1(TreeNode root, int sum,int curSum,boolean flag) {
        if(flag){
            return flag;
        }
        curSum = curSum + root.val;
        if(root.left == null && root.right == null){
            if(curSum==sum){
                flag = true;
            }
            curSum = curSum - root.val;
        }

        if(root.left!=null){
            hasPathSum1(root.left,sum,curSum,flag);
        }

        if(root.right!=null){
            hasPathSum1(root.right,sum,curSum,flag);
        }
        if(flag){
            return flag;
        }
        return flag;
    }
}


