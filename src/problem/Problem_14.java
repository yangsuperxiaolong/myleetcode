package problem;

public class Problem_14 {
    public static void main(String[] args) {
        //String[] strs  = new String[]{"flower","flow","flight"};
        String[] strs  = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        if(strs.length==0){
            return "";
        }
        int minSize = strs[0].length();
        for(int i = 1 ; i< strs.length;i++){
            minSize =  strs[i].length()<minSize? strs[i].length() : minSize;

        }
        for(int i = 0 ;i < minSize; i++){
            boolean isSame = true;
            for(int j = 0; j < strs.length -1; j++ ){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    isSame = false;
                }
            }
            if(isSame){
                sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();

    }

}
