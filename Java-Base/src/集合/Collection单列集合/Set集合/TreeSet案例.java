package 集合.Collection单列集合.Set集合;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 按照字符串长度排序
 *
 */
public class TreeSet案例 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    // 按照首字母顺序排序
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        treeSet.add("hskkd");
        treeSet.add("hskkdt");
        treeSet.add("hsd");
        treeSet.add("asd");
        treeSet.add("hsdoqmmms");


        System.out.println(treeSet);

    }
}
