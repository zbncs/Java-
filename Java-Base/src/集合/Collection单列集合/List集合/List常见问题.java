package 集合.Collection单列集合.List集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List常见问题 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iterator = list.iterator();

        // 常见迭代器中使用*集合*操作元素错误
        //listAddError(list, iterator);

        /**
         * Iterator接口提供的方法有限，使用他的子接口ListIterator进行更多元素的操作
         * 只有List集合基本该功能
         */
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if (next.equals("2")) {
                listIterator.add("2-1");
            }
            System.out.println(next);
        }
        System.out.println(list);

        // 反向遍历
        while (listIterator.hasPrevious()) {
            String previous = listIterator.previous();
            System.out.println(previous);
        }
    }

    private static void listAddError(ArrayList<String> list, Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("2")) {
                list.add("2-1"); // 使用集合操作了迭代器元素
            }
            System.out.println(next);
        }
    }
}
