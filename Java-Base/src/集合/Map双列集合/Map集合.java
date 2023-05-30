package 集合.Map双列集合;

import java.util.HashMap;

/**
 * Map集合中存储的是键值对，键是唯一的；
 *
 */
public class Map集合 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<String, String>();
        // Map集合常用的公共方法
        System.out.println("========添加==========");

        hashMap.put("1", "111");
        hashMap.put("2", "222");
        hashMap.put("3", "333");

        // 返回被替换掉的原来的旧值，如果没有返回null
        Object put = hashMap.put("2", "000");

        System.out.println(hashMap);
        System.out.println(put);

        System.out.println("========删除==========");

        // 返回键值中的值
        System.out.println(hashMap.remove("2"));
        // 清空
//        hashMap.clear();

        System.out.println("========判断==========");
        System.out.println(hashMap.containsKey("1"));
        System.out.println(hashMap.containsValue("000"));
        System.out.println(hashMap.isEmpty());

        System.out.println("========获取==========");
        System.out.println(hashMap.get("6")); // 没有该键，返回null
        System.out.println(hashMap.size());

    }
}
