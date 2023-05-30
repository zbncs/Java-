package 集合.工具;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arrays工具类 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3,  4, 5}; // 数组里面的元素必须是对象类型

        System.out.println("============asList数组转List=============");

        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        /**
         * 转成List集合后，不能进行增删操作，改变数组的长度；
         */
        //list.add(9);

        // 不是对象类型时
        int[] arr1 = {1, 2, 3,  4, 5};
        System.out.println(Arrays.asList(arr1));

        System.out.println("============List集合转数组=============");
        System.out.println(Arrays.toString(list.toArray()));

        // 可变参数，必须定义在其他参数后面
        test(1, 2 ,4);

    }

    public static void test(Integer... arr) {
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
