package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 120. 三角形最小路径和
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * <p>
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * <p>
 * <p>
 * <p>
 * 例如，给定三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * <p>
 * 说明：
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */
public class Problem_120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(6,5,7);
        List<Integer> list4 = Arrays.asList(4,1,8,3);
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        minimumTotal(triangle);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        if(row == 0){
            return 0;
        }
        //dp 表示第i行，第j个数字的最短路径
        int[][] dp = new int[row][row];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < row; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
               if(j==0){
                   dp[i][j] = dp[i-1][j] + triangle.get(i).get(j);
               }else if(j==triangle.get(i).size()-1){
                   dp[i][j] = dp[i-1][j-1]+ triangle.get(i).get(j);
               }else {
                   dp[i][j] = Math.min(dp[i-1][j-1]+triangle.get(i).get(j),dp[i-1][j]+triangle.get(i).get(j));
               }
            }
        }

        //求最后一行最小值
        int result = Integer.MAX_VALUE;
        for(int i = 0 ; i < row ;i ++){
            result = Math.min(result,dp[row-1][i]);
        }
        return result;
    }
}
