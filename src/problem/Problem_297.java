package problem;

public class Problem_297 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node2.left = node4;
        root.left = node2;

        node3.left = node5;
        node3.right = node6;
        root.right = node3;

        Codec codec = new Codec();
        String result = codec.serialize(root);

        System.out.println(result);
    }


}

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer result = new StringBuffer();
        String aa =  recurrSerialize(root,result);
        return aa;
    }

    public String recurrSerialize(TreeNode root,StringBuffer sb) {
        if (root ==  null){
            sb.append("null,");
            return sb.toString();
        }
        sb.append(root.val).append(",");

        recurrSerialize(root.left,sb);
        recurrSerialize(root.right,sb);

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] array = data.split(",");

        return null;
    }

    public TreeNode recurrdeserialize(TreeNode root,String data) {
        if(data.equals("null")) {
            root = new TreeNode(Integer.valueOf(data));
        }else {
            root = null;
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
