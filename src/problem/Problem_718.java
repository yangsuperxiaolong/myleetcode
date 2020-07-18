package problem;

/**
 * 718. 最长重复子数组
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出：3
 * 解释：
 * 长度最长的公共子数组是 [3, 2, 1] 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= len(A), len(B) <= 1000
 * 0 <= A[i], B[i] < 100
 */
public class Problem_718 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 2, 1};
        int[] B = new int[]{3, 2, 1, 4, 7};
        System.out.println(findLength(A, B));
    }

    public static int findLength(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return 0;
        }

        int[][] result = new int[A.length+1][B.length+1];
        if (A[0] == B[0]) {
            result[0][0] = 1;
        } else {
            result[0][0] = 0;
        }

//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == B[0]) {
//                result[i][0] = 1;
//            } else {
//                result[i][0] = 0;
//            }
//        }
//
//        for (int j = 0; j < B.length; j++) {
//            if (A[0] == B[j]) {
//                result[0][j] = 1;
//            } else {
//                result[0][j] = 0;
//            }
//        }

        int maxLenght = 0;
        for (int i = 1; i < A.length+1; i++) {
            for (int j = 1; j < B.length+1; j++) {
                if (A[i-1] == B[j-1]) {
                    result[i][j] = result[i - 1][j - 1] + 1;
                    maxLenght = Math.max(maxLenght,result[i][j]);
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return maxLenght;
    }
}
