package problem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true
 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Problem_9 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("result="+isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while (x>0){
            list.add(x%10);
            x = x/10;
        }

        Integer[] array = list.toArray(new Integer[list.size()]);

        int left = 0;
        int right = array.length-1;
        while (left<=right){
            if(!array[left].equals(array[right])){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}
