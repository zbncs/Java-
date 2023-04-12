package HashMap相关;

import java.util.Hashtable;

/**
 *  HashMap和HashTable区别：
 *      1.HashMap可以允许键值出现null
 *      2.HashTable不允许出现键值为null的情况
 */
public class HashMap和HashTable区别 {
    public static void main(String[] args) {
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put(null, null); // 报错
        System.out.println(hashtable);
    }
}
