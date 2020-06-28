package problem;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;

/**
 *
 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

 说明：本题中，我们将空字符串定义为有效的回文串。

 示例 1:

 输入: "A man, a plan, a canal: Panama"
 输出: true
 示例 2:

 输入: "race a car"
 输出: false
 */
public class Problem_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }

        List<String> temp = new ArrayList();
        for(int i = 0 ;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                temp.add(String.valueOf(s.charAt(i)));
            }
        }

        String[] dlArray = (String[]) temp.toArray(new String[temp.size()]);

        int left = 0;
        int right =dlArray.length-1;

        while(right>=left){
            if(!dlArray[right].equalsIgnoreCase(dlArray[left])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
