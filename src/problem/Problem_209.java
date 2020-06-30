package problem;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 * <p>
 * 示例: 
 * <p>
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 进阶:
 * <p>
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_209 {

    public static void main(String[] args) {

//         int s = 7;
//         int[] nums = new int[]{2,3,1,2,4,3};

        int s = 213;
        int[] nums = new int[]{12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};

//        int s = 8;
//        int[] nums = new int[]{2,3,1,4,6,7};

//        int s = 11;
//        int[] nums = new int[]{1,2,3,4,5};

        System.out.println(minSubArrayLen(s, nums));

    }

    public static int minSubArrayLen(int s, int[] nums) {

        if (nums.length <= 0) {
            return 0;
        }

        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        int left = 0;
        int right = 0;

        while(left<nums.length && right<nums.length){
            sum = sum + nums[right];
            while (sum>=s){
                minLength = Math.min(minLength,right-left+1);
                sum = sum-nums[left];
                left++;
            }
            right++;
        }
        return minLength;
    }

}
