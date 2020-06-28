package problem;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *  
 * <p>
 * 提示：
 * <p>
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_16 {
    public static void main(String[] args) {
//        int[] nums = new int[]{-1,2,1,-4};
//        int target = 1;

//        int[] nums = new int[]{0,1,2};
//        int target = 0;
        int[] nums = new int[]{1,2,4,8,16,32,64,128};
        int target = 82;

//        int[] nums = new int[]{1,1,-1,-1,3};
//        int target = -1;
        int sum = threeSumClosest(nums,target);
        System.out.println(sum);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int diff = Integer.MAX_VALUE;
        int result = 0;
        while (left < right) {
            //int mid = (left+right)/2;
            for(int mid = left+1; mid<right;mid++) {

                int curSum = nums[left] + nums[right] + nums[mid];

                if (curSum > target) {
                    if (Math.abs(curSum - target) < diff) {
                        diff = Math.abs(curSum - target);
                        result = curSum;
                    }
                    right--;
                    break;
                } else if (curSum < target) {
                    if (Math.abs(curSum - target) < diff) {
                        diff = Math.abs(curSum - target);
                        result = curSum;
                    }
                } else {
                    //相等
                    return curSum;
                }
            }
        }
        return result;
    }
}
