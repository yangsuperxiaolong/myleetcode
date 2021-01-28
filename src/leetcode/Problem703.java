package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Companies
 * 设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 * <p>
 * 请实现 KthLargest 类：
 * <p>
 * KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
 * int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：
 * ["KthLargest", "add", "add", "add", "add", "add"]
 * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 * 输出：
 * [null, 4, 5, 5, 8, 8]
 * <p>
 * 解释：
 * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
 * kthLargest.add(3);   // return 4
 * kthLargest.add(5);   // return 5
 * kthLargest.add(10);  // return 5
 * kthLargest.add(9);   // return 8
 * kthLargest.add(4);   // return 8
 * <p>
 * <p>
 * 提示：
 * 1 <= k <= 104
 * 0 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * -104 <= val <= 104
 * 最多调用 add 方法 104 次
 * 题目数据保证，在查找第 k大元素时，数组中至少有 k 个元素
 */
public class Problem703 {
    public static void main(String[] args) {
//        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
//        int i = kthLargest.add(3);   // return 4
//        int j = kthLargest.add(5);   // return 5
//        int k = kthLargest.add(10);  // return 5
//        int s = kthLargest.add(9);   // return 8
//        int l = kthLargest.add(4);   // return 8


        KthLargest kthLargest = new KthLargest(1, new int[]{});
        int i = kthLargest.add(-3);
        int j = kthLargest.add(-2);
        int k = kthLargest.add(-4);
        int s = kthLargest.add(0);
        int l = kthLargest.add(4);

        return;
    }
}

class KthLargest {

    private List<Integer> list;
    private int k = 0;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
    }

    public int add(int val) {
        list.add(val);
        list.sort((o1, o2) -> o1 - o2);
        return list.get(list.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */