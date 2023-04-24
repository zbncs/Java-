package List集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * 1. ArrayList 和 Vector底层采用数组存储元素，适合遍历查找。LinkedList采用的是双向链表存储元素，适合插入和删除。
 *      Vector 是线程安全的；
 * 2. ArrayList 和 Vector 的初始容量都是10，ArrayLis自动扩容后的容量是扩容前的1.5倍。
 *      Vector如果没有指定扩容后的增加量，那就扩容原来的两倍，指定了就是就增加指定的量。
 */

public class ArrayList_LinkedList_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

    }
}
