package 集合.Collection单列集合.List集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * subList 返回值是一个List, 这个List引用仍然指向原来的ArrayList。
 * SubList 也是ArrayList的内部类，没有继承关系，类型无法转化成ArrayList
 */

public class SubList方法 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "1", "2", "3");

        List<Object> subList = arrayList.subList(1, 3);
        subList.add("4");
        System.out.println(subList);
        System.out.println(arrayList);
    }
}
