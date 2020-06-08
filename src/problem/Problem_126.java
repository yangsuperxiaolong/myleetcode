package problem;

import java.beans.Encoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个单词（beginWord 和 endWord）和一个字典 wordList，找出所有从 beginWord 到 endWord 的最短转换序列。转换需遵循如下规则：
 *
 * 每次转换只能改变一个字母。
 * 转换过程中的中间单词必须是字典中的单词。
 * 说明:
 *
 * 如果不存在这样的转换序列，返回一个空列表。
 * 所有单词具有相同的长度。
 * 所有单词只由小写字母组成。
 * 字典中不存在重复的单词。
 * 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-ladder-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_126 {
    public static void main(String[] args) {
        /**
         * 输入:
         * beginWord = "hit",
         * endWord = "cog",
         * wordList = ["hot","dot","dog","lot","log","cog"]
         *
         * 输出:
         * [
         *   ["hit","hot","dot","dog","cog"],
         *   ["hit","hot","lot","log","cog"]
         * ]
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/word-ladder-ii
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */

        //System.out.println(isJustOneWordDiff("hit","how"));
        String a = "a cc dd   ";
        String b = "";
        b = a.trim();
        System.out.println(a);
        String kan = "侃";
        try {
            String ax = new String(kan.getBytes(""), "UTF-8");
            System.out.println(ax);
        }catch (UnsupportedEncodingException e){

        }


    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList();
        for(String temp : wordList){
            List<String> list = new ArrayList<>();

        }
        return null;
    }

    private static boolean isJustOneWordDiff(String a,String b){
        int diffNum = 0;
        for(int i = 0; i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                diffNum ++ ;
            }
        }
        if(diffNum ==1){
            return true;
        }
        return false;
    }
}


