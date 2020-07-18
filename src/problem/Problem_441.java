package problem;

/**
 * 441. 排列硬币
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * <p>
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * <p>
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 * <p>
 * 示例 1:
 * <p>
 * n = 5
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第三行不完整，所以返回2.
 * 示例 2:
 * <p>
 * n = 8
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第四行不完整，所以返回3.
 */
public class Problem_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    /**
     * 解题思路：
     * 考察点：二分法是否熟练，临界值处理（导致几次提交失败）
     * 注意点：要用long型，题目 提醒n 是一个非负整数，并且在32位有符号整型的范围内。这个给了一个错觉。
     *       两个数值乘积肯定超出了int类型，计算会出错。
     */
    public static int arrangeCoins(int n) {
        long k = 0;
        if (n == 0) {
            return 0;
        }
        long left = 1;
        long right = n;
        while (left <= right) {
            k = (left + right) >>> 1;

            long sumK = (k * (k + 1)) >> 1;
            long sumk1 = ((k+1) *(k+2))>>1;
            if(n>=sumK && n<sumk1){
                return (int)k;
            }else if(n>sumK) {
                left = k+1;
            }else if(n<sumK) {
                right = k - 1;
            }
        }
        return (int)left;
    }

}
