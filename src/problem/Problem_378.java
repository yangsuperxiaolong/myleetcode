package problem;

import java.util.Arrays;

/**
 * @Description:
 * @author: wlyang
 * @since: 7/2/2020
 */
public class Problem_378 {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{ 1,  5,  9},{10, 11, 13},{12, 13, 15}};
        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }

    //TODO 二分法 和 归并排序

    public static int kthSmallest(int[][] matrix, int k) {
        /**
         * 投机取巧，没有利用矩阵特点
         */
        int[] result = new int[matrix.length*matrix[0].length];
        int index = 0;
        for(int i= 0;i<matrix.length;i++){
            for(int j = 0 ;j<matrix[0].length;j++){
                result[index++] = matrix[i][j];
            }
        }
        Arrays.sort(result);
        return result[k-1];
    }

}
