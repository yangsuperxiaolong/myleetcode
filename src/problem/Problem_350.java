package problem;

import java.util.*;

/**
 * 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 */
public class Problem_350 {
    public static void main(String[] args) {
//        int[] nums1 = new int[]{4,9,5};
//
//        int[] nums2 = new int[]{9,4,9,8,4};

        int[] nums1 = new int[]{1,2,2,2,1};

        int[] nums2 = new int[]{2,2};

        intersect(nums1,nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> nums2Map = new HashMap<>();
        for (int j = 0; j < nums2.length; j++) {
            //个数
            int nums = nums2Map.get(nums2[j]) == null? 1 : nums2Map.get(nums2[j])+1;
            nums2Map.put(nums2[j],nums);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if(nums2Map.get(nums1[i])!=null && nums2Map.get(nums1[i])>0){
                resultList.add(nums1[i]);
                int curNums = nums2Map.get(nums1[i])-1;
                nums2Map.put(nums1[i],curNums);
            }
        }

        int[] result = new int[resultList.size()];
        for(int i = 0 ;i <resultList.size();i++){
            result[i] = resultList.get(i);
        }

        return result;
    }
}
