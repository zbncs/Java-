package Base.字符串.String算法;

/**
 * 两个字符串中最大相同的子串
 */
public class 最大相同子串 {
    public static void main(String[] args) {
        String str1 = "qweqwesdsgg";
        String str2 = "qwsssdddwesdddew";

        System.out.println(maxSameStr(str1, str2));

    }

    /**
     *
     * @param str1
     * @param str2
     * @return
     *
     * s: 子串的开始位置，e:子串的结束位置
     *
     */

    public static String maxSameStr(String str1, String str2) {
        String min = str1.length() > str2.length() ? str2 : str1;
        String max = str1.length() > str2.length() ? str1 : str2;
        
        for (int i = 0; i < min.length(); i++) {
            for (int s = 0, e = min.length() - i; e != min.length() + 1; s++, e++) {
                String sub = min.substring(s, e);
                if (max.contains(sub)) {
                    return sub;
                }
            }
        }
        return null;
    }
}
