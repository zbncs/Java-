package 集合.HashMap相关;

import java.util.Hashtable;

/**
 *  HashMap和HashTable区别：
 *      1.HashMap可以允许键值出现null，HashTable不允许出现键值为null的情况
 *      2.HashMap是不同步的(线程不安全的)，HashTable是同步的(线程安全的)
 */
public class HashMap和HashTable区别 {
    public static void main(String[] args) {
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put(null, null); // 报错
        System.out.println(hashtable);
    }
}
