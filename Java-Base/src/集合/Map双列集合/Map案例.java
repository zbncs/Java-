package 集合.Map双列集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *  1.获取字符串中每个字符出现的次数，打印：a(2)b(1)c(6)...
 *  2.
 */
public class Map案例 {
    public static void main(String[] args) {
        System.out.println(getNumOfStr("fdgavcbsacdfs"));
    }

    public static String getNumOfStr(String str) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map.toString());
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        String s = "";
        for (Map.Entry<String, Integer> m : set) {
            s += m.getKey() + "("+ m.getValue() +")";
        }
        return s;
    }
}
