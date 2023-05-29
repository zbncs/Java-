package 集合.Collection单列集合.List集合;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList特有方法 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("===============添加头部=================");
        linkedList.addFirst("1");
        linkedList.addFirst("2");
        linkedList.addFirst("3");
        linkedList.offerFirst("0");

        System.out.println("===============添加末尾=================");
        linkedList.addLast("4");
        linkedList.addLast("5");
        linkedList.addLast("6");
        linkedList.offerLast("7");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("===============删除头部=================");
        // 删除，没有抛出异常
        System.out.println(linkedList.removeFirst());
        // 删除，没有返回null
        System.out.println(linkedList.pollFirst());

        System.out.println("===============删除末尾=================");
        // 删除，没有抛出异常
        System.out.println(linkedList.removeLast());
        // 删除，返回null
        System.out.println(linkedList.pollLast());

        System.out.println("===============查头部=================");
        // 获取不到抛出异常
        System.out.println(linkedList.getFirst());
        // 获取不到返回null
        System.out.println(linkedList.peekFirst());

        System.out.println("===============添加尾部=================");
        // 获取不到抛出异常
        System.out.println(linkedList.getLast());
        // 获取不到返回null
        System.out.println(linkedList.peekLast());

    }
}
