package problem;

import java.util.Stack;

/**
 *
 给你两个二进制字符串，返回它们的和（用二进制表示）。

 输入为 非空 字符串且只包含数字 1 和 0。



 示例 1:

 输入: a = "11", b = "1"
 输出: "100"
 示例 2:

 输入: a = "1010", b = "1011"
 输出: "10101"
 */
public class Problem_67 {

    public static void main(String[] args) {
       //String a = "11"; String b = "1";
         String a = "1010" ; String  b = "1011";
        String result = addBinary(a,b);
        System.out.println(result);
    }

    public static String addBinary(String a, String b) {
        Stack<String> aStack = new Stack();
        Stack<String> bStack = new Stack();

        Stack<String> resultStack = new Stack();
        for(int i = 0 ; i< a.length() ;i ++){
            aStack.push(a.substring(i,i+1));
        }
        for(int i = 0 ; i< b.length() ;i ++){
            bStack.push(b.substring(i,i+1));
        }
        int carryBit = 0;
        while (!aStack.isEmpty() || !bStack.isEmpty()){
            int aCur = 0;
            int bCur = 0;
            if(!aStack.isEmpty() && !bStack.isEmpty()){
                aCur = Integer.valueOf(aStack.pop());
                bCur = Integer.valueOf(bStack.pop());
            }else if(aStack.isEmpty()){
                bCur = Integer.valueOf(bStack.pop());
            }else if(bStack.isEmpty()){
                aCur = Integer.valueOf(aStack.pop());
            }
            int resultCur = (aCur+bCur+carryBit)%2;
            if(aCur+bCur+carryBit>1){
                carryBit = 1;
            }else {
                carryBit = 0;
            }
            resultStack.push(String.valueOf(resultCur));
        }
        if(carryBit>0){
            resultStack.push(String.valueOf(carryBit));
        }
        StringBuffer reusult = new StringBuffer();
        while (!resultStack.isEmpty()){
            reusult.append(resultStack.pop());
        }
        return reusult.toString();
    }
}
