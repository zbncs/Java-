package HashMap相关;

import java.util.HashMap;

/**
 * HashMap的特性：
 *      1.HashMap是一个双列结合，将键映射到值的对象
 *      2.Map集合中的键不能重复，无序，无索引
 *      3.Map集合的键值对可以为null
 *
 * Map中的值是如何保持唯一的？
 *      内部采用的是哈希表结构：数组 + 链表；
 *      hashcode方法返回值是决定对象存储在数组哪个位置，equals返回值比较两个对象内容是否相等
 *      先找位置，再去比较当前位置的内容和要存入对象的内容；
 *
 *
 *      如果见存储的是自定义对象，需要重写equals和hashcode方法；
 *
 */

public class HashMap特性 {
    public static void main(String[] args) {
        HashMap<Object, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(3, "3");
        map.put(null, null);

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "1");
        map1.put("3", "3");
        map1.remove("3");

        map.putAll(map1);
        System.out.println(map);
        System.out.println(map.get(1));
    }
}
