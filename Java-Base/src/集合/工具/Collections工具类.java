package 集合.工具;

import java.util.*;

public class Collections工具类 {
    public static void main(String[] args) {
        // 对List集合排序
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        list.add("sdfgdd");
        list.add("ddggd");
        list.add("zzz");

        Collections.sort(list);

        System.out.println(list);


        System.out.println("===========按照字符串长度排毒===================");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        System.out.println(list);

        System.out.println("===========swap交换===================");

        Collections.swap(list, 0, 1);
        System.out.println(list);

        System.out.println("===========二分查找===================");
        Collections.sort(list);
        System.out.println(list);
        int i = Collections.binarySearch(list, "zzz");
        System.out.println(i);

        System.out.println("===========最大最小值===================");
        String max = Collections.max(list);
        System.out.println("max="+max);
        System.out.println("min="+Collections.min(list));

        String max1 = Collections.max(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("max1="+max1);

        System.out.println("===========reverseOrder返回一个比较器===================");

        TreeSet<String> set = new TreeSet<String>(Collections.reverseOrder());
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);

        Collections.sort(list, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));
        System.out.println(list);

        System.out.println("===========replaceAll===================");
        Collections.replaceAll(list, "zzz", "jywlp");
        System.out.println(list);

        System.out.println("===========shuffle随机集合中元素===================");
        Collections.shuffle(list);


        System.out.println("===========synchronizedCollection/synchronizedList返回同步的（线程安全的）List===================");



    }
}
