package problem;

import java.util.*;

/**
 * 给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程 equations[i] 的长度为 4，并采用两种不同的形式之一："a==b" 或 "a!=b"。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。
 *
 * 只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。 
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["a==b","b!=a"]
 * 输出：false
 * 解释：如果我们指定，a = 1 且 b = 1，那么可以满足第一个方程，但无法满足第二个方程。没有办法分配变量同时满足这两个方程。
 * 示例 2：
 *
 * 输出：["b==a","a==b"]
 * 输入：true
 * 解释：我们可以指定 a = 1 且 b = 1 以满足满足这两个方程。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/satisfiability-of-equality-equations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_999 {
    public static void main(String[] args) {
        String[] equations = new String[]{"a==b","b==c","a!=c"};
        equationsPossible(equations);
    }
    public static boolean equationsPossible(String[] equations) {
        Map<Character,List<Character>> equalMap = new HashMap<>();
        Map<Character, List<Character>> notEqualMap = new HashMap<>();
        for(int i = 0 ;i< equations.length;i++){
            if(equations[i].charAt(1) == '='){
                if(equalMap.get(equations[i].charAt(0)) == null){
                    List <Character> newList = new ArrayList<>();
                    newList.add(equations[i].charAt(3));
                    equalMap.put(equations[i].charAt(0),newList);
                }else{
                    List a = equalMap.get(equations[i].charAt(0));
                    a.add(equations[i].charAt(3));
                    equalMap.put(equations[i].charAt(0),a);
                }
                if(equalMap.get(equations[i].charAt(3)) == null){
                    List <Character> newList = new ArrayList<>();
                    newList.add(equations[i].charAt(0));
                    equalMap.put(equations[i].charAt(3),newList);
                }else{
                    List a = equalMap.get(equations[i].charAt(3));
                    a.add(equations[i].charAt(0));
                    equalMap.put(equations[i].charAt(3),a);
                }
            }else if(equations[i].charAt(1) == '!'){
                if(notEqualMap.get(equations[i].charAt(0)) == null){
                    List <Character> newList = new ArrayList<>();
                    newList.add(equations[i].charAt(3));
                    notEqualMap.put(equations[i].charAt(0),newList);
                }else{
                    List a = notEqualMap.get(equations[i].charAt(0));
                    a.add(equations[i].charAt(3));
                    notEqualMap.put(equations[i].charAt(0),a);
                }
                if(notEqualMap.get(equations[i].charAt(3)) == null){
                    List <Character> newList = new ArrayList<>();
                    newList.add(equations[i].charAt(0));
                    notEqualMap.put(equations[i].charAt(3),newList);
                }else{
                    List a = notEqualMap.get(equations[i].charAt(3));
                    a.add(equations[i].charAt(0));
                    notEqualMap.put(equations[i].charAt(3),a);
                }
            }
        }

        /**
         * 如果list有相同的，建立相同关系
         */
        for(Character character : equalMap.keySet()){
            if(equalMap.get(character)!=null && equalMap.get(character).size()>1){

            }
        }
        return true;
    }
}
