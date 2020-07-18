package problem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。



 在杨辉三角中，每个数是它左上方和右上方的数的和。

 示例:

 输入: 5
 输出:
 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 */
public class Problem_118 {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        return;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows ==0){
            return result;
        }
        List<Integer> one = new ArrayList<>();
        one.add(1);
        result.add(one);
        for(int i = 1;i<numRows;i++){
            List<Integer> preList = result.get(i-1);
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j == i){
                    temp.add(1);
                }else {
                    temp.add(preList.get(j-1)+preList.get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }
}
