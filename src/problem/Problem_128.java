package problem;

import java.util.*;

public class Problem_128 {
    public static void main(String[] args) {
        //int[] num = new int[]{2147483646,-2147483647,0,2,2147483644,-2147483645,2147483645};
        int[] num = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(num));
    }

    public static  int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int result = 1;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 0 ; i< nums.length ;i++){
            treeSet.add(nums[i]);
        }
        //int result
        Iterator it = treeSet.iterator();
        int index = 0;
        while (it.hasNext()){
             nums[index] = (int)it.next();
             index++;
        }
        int temp = 1;
        for(int i = 0 ; i< nums.length -1 ;i++){
            if(nums[i+1]-nums[i] ==1){
                temp++;
            }else {
                temp = 1;
            }
            if(temp>result){
                result = temp;
            }
        }

        return result;
    }
}
