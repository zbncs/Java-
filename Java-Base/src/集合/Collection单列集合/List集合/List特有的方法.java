package 集合.Collection单列集合.List集合;

import java.util.ArrayList;

/**
 * List 有索引：特有方法都和索引有关
 *
 */
public class List特有的方法 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("=============新增===============");

        list.add(0, "00");
        list.add(1, "11");
        list.add(2, "22");

        System.out.println("=============删除===============");

        String remove = list.remove(2);
        System.out.println(remove); // 返回删除的元素

        System.out.println("=============修改===============");

        String set = list.set(1, "111");
        System.out.println(set); // 返回修改的元素

        System.out.println("=============查===============");

        String i = list.get(1);
        System.out.println(i);

        // 元素的位置
        System.out.println(list.indexOf("00"));


    }
}
