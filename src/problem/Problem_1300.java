package problem;

import java.util.Arrays;

/**
 * 给你一个整数数组 arr 和一个目标值 target ，请你返回一个整数 value ，
 * 使得将数组中所有大于 value 的值变成 value 后，数组的和最接近  target （最接近表示两者之差的绝对值最小）。
 * <p>
 * 如果有多种使得和最接近 target 的方案，请你返回这些整数中的最小值。
 * <p>
 * 请注意，答案不一定是 arr 中的数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-mutated-array-closest-to-target
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_1300 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5,8};
        int target = 19;
        int i = 11 %3;
        int j = 11 %4;

        findBestValue(arr,target);
    }

    public static int findBestValue(int[] arr, int target) {
        int [] result = new int[arr.length];
        //
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            int rightLength = arr.length - i;
            int div = (target - temp)/rightLength;
            int min = target-(rightLength*div) <= (rightLength* (div+1)) - target? div:div+1;
            result[i] = min;
            temp = temp ++;
        }
        return 0;
    }
}
