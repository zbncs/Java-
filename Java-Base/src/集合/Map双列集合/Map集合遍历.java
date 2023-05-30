package 集合.Map双列集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *   Map集合不能直接遍历，可以转成单列集合遍历
 *
 */
public class Map集合遍历 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "111");
        hashMap.put(2, "222");
        hashMap.put(3, "333");
        System.out.println("==============keySet()=============");

        Set<Integer> keySet = hashMap.keySet();
        for (Integer k : keySet) {
            System.out.println(hashMap.get(k));
        }

        System.out.println("==============values()=============");

        Collection<String> values = hashMap.values();
        for (String v : values) {
            System.out.println(v);
        }

        System.out.println("==============entrySet()=============");

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> v : entrySet) {
            System.out.println(v.getKey());
            System.out.println(v.getValue());
        }
    }
}
