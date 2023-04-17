package 泛型;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1.泛型不支持基本类型
 * 2.泛型影响方法重载
 * 3.不能使用instanceof 和 new 一个泛型
 *
 * Object 和 ?
 * Object 是表示任意类型
 * ? 表示未知类型
 */

public class 泛型限制 {
    public static void main(String[] args) {
        ArrayList<?> list = new ArrayList<>();
        // list.add("1"); // 出错，?代表未知类型，只能读取，不能添加

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");

        test1(Collections.singletonList(list1));
        // test1(list1); // 错误，不能将List<String> 赋值给 List<Object>
    }

//    public void test(List<String> list) {
//
//    }
    public void test(List<Integer> list) {

    }
    public static void test1(List<Object> list) {

    }
}

