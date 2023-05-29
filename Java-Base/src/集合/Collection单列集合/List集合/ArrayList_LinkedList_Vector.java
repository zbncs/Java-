package 集合.Collection单列集合.List集合;

import java.util.*;

/**
 * 集合是存储 *对象* 的容器。数组是固定长度，集合长度是可变的；
 *
 * List 有序，有索引， 可重复
 *
 * 1. ArrayList 和 Vector底层采用 *数组* 存储元素，适合遍历查找。LinkedList采用的是 *双向链表* 存储元素，适合插入和删除。
 *      Vector 是线程安全的，效率没有ArrayList高；
 * 2. ArrayList 和 Vector 的初始容量都是10，ArrayLis自动扩容后的容量是扩容前的1.5倍。
 *      Vector如果没有指定扩容后的增加量，那就扩容原来的两倍，指定了就是就增加指定的量。
 *
 *  3.为什么数组类型查找快，增删慢？链表类型的查找慢，增删快？
 *
 *      数组类型的可以通过数组下标快速查找，增加删除会导致数组元素位置放生变化
 *      链表类型的查找都是从头开始查找，增删只需要更改元素的指向
 */

public class ArrayList_LinkedList_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("===================添加========================");

        arrayList.add("arrayList");
        arrayList.add("arrayList1");
        arrayList.add("arrayList2");

        vector.add("vector");
        vector.add("vector1");
        vector.add(2, "vector2");
        // 添加集合
        vector.addAll(arrayList);

        System.out.println(vector);

        System.out.println("====================删除=======================");

        vector.remove("vector");
        vector.remove(0);
        // 删除集合
        vector.removeAll(arrayList);
        System.out.println(vector);

        System.out.println("======================取交集和removeAll相反=====================");
        arrayList.add("vector2");
        // 会把不同的元素都删除
        System.out.println(vector);
        arrayList.retainAll(vector);
        System.out.println(arrayList);

        System.out.println("======================获取=====================");

        System.out.println(vector.get(0));
        System.out.println(vector.size());

        System.out.println("================包含===========================");
        // 包含
        System.out.println(vector.contains("vector2"));

        linkedList.add("vector2");
        System.out.println(vector.containsAll(linkedList));

        System.out.println("====================遍历=======================");

        // 遍历

        // 1.for
        vector.add("vector");
        vector.add("vector1");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
        System.out.println("===========================================");

        // 2.foreach
        for (String v :vector) {
            System.out.println(v);
        }
        System.out.println("==================iterator迭代器=========================");

        // iterator迭代器
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // iterator1会自动释放内存
        for (Iterator iterator1 = vector.iterator(); iterator1.hasNext();) {
            System.out.println(iterator1.next());
        }
        System.out.println("===========================================");

        // 转成数组遍历
        Object[] array = vector.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===========================================");

        // 清空集合
        vector.clear();
        System.out.println(vector);

        // 是否为空
        System.out.println(vector.isEmpty());

    }
}
