package problem;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class Problem_20 {
    public static void main(String[] args) {
        String s = "()[]{[()]}";
        System.out.println(isValid1(s));
    }

    public static boolean isValid(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return "".equals(s);
    }

    public static boolean isValid1(String s) {
        Stack<Character> leftStack = new Stack<>();
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                leftStack.push(s.charAt(i));
            }

            if (!leftStack.isEmpty()) {
                if (s.charAt(i) == '}') {
                    if (leftStack.peek() != '{') {
                        return false;
                    }
                    leftStack.pop();
                } else if (s.charAt(i) == ']') {
                    if (leftStack.peek() != '[') {
                        return false;
                    }
                    leftStack.pop();
                } else if (s.charAt(i) == ')') {
                    if (leftStack.peek() != '(') {
                        return false;
                    }
                    leftStack.pop();
                }
            }else {
                return false;
            }
        }
        return leftStack.isEmpty();
    }
}
