package problem;

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_15 {
    public static void main(String[] args) {
        int[] nums  = new int[]{-3,-2,-1,0,-4,5};
        threeSum(nums);
    }

    /**
     * 思路 排序 + 双指针 ，用HashSet去重
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if(nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        for(int i = 0 ;i < nums.length;i++){
            int l = i+1;
            int r = nums.length-1;
            while (r>l){
                if (nums[l] + nums[i] + nums[r] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[l]);
                    temp.add(nums[i]);
                    temp.add(nums[r]);
                    result.add(temp);
                    l++;
                    r--;
                }else if(nums[l] + nums[i] + nums[r] > 0){
                    r--;
                }else {
                    l++;
                }
            }
        }
        List<List<Integer>> lastResult = new ArrayList<>();
        lastResult.addAll(result);
        return lastResult;
    }
}
