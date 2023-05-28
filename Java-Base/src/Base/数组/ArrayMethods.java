package Base.数组;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayMethods {
    public static void main(String[] args) {
        // 数组转ArrayList，元素必须是对象，基本类型要是包装类型
        Integer[] intArray = { 1, 2, 4, 5 };
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(intArray));
        System.out.println(arrayList);   // [1, 2, 4, 5]

        // 检查数组中是否包含某一个值
        boolean isContains = Arrays.asList(intArray).contains(2);
        System.out.println(isContains);

        // 连接两个数组 common-lang3 工具类的方法
        int[] intArray1 = { 1, 2, 3, 4, 5 };
        int[] intArray2 = { 6, 7, 8, 9, 10 };
        Integer[] intArray3 = {6, 8, 9, 0};

        int[] all = ArrayUtils.addAll(intArray1, intArray2);
        System.out.println(Arrays.toString(all));

        // 数组转字符串 join, 元素必须是对象，基本类型要是包装类型。
        String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
        System.out.println(j);

        String join = StringUtils.join(new Integer[]{1, 2, 3, 5}, ",");
        System.out.println(join);

        String join1 = StringUtils.join(intArray3, ",");
        System.out.println(join1);

        // 将Array转化成Set集合，元素必须是对象，基本类型要是包装类型
        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(intArray3));
        System.out.println(set);

        // 数组翻转
        int[] arr = {1, 3, 5, 6};
        ArrayUtils.reverse(arr);
        System.out.println(Arrays.toString(arr));

        // 从数组中移除一个元素
        // remove: 删除要删除元素的索引，返回一个剩余数组
        // removeElement：传入要删除的元素，返回一个剩余数组

        int[] remove = ArrayUtils.remove(arr, 0);
        int[] element = ArrayUtils.removeElement(arr, 5);
        System.out.println(Arrays.toString(remove));
        System.out.println(Arrays.toString(element));
        System.out.println(Arrays.toString(arr));

        /*
        Arrays.equals(arr1, arr2)比较的是内容
        arr1.equals(arr2)：比较的是内存地址
        Arrays.deepEquals() 方法： 如果两个指定的数组彼此 深度相等 ，则返回 true
         */
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {1, 3, 5, 6};
        System.out.println(Arrays.equals(arr2, arr1));
        System.out.println(arr2.equals(arr1));

        /*
        .toString（）方法： 返回对象的(数组地址)字符串表示形式。
        Arrays.toString() 方法：返回指定数组的内容的字符串表示形式。
         */
        System.out.println(arr1.toString());
        System.out.println(Arrays.toString(arr1));

        /*
        Arrays.binarySearch() 方法： 使用二进制搜索算法搜索指定值的指定数组内容。要求被查找的一维数组必须是有序的，否则结果是错误的
         */

        String[] arr3={"1","2","3"};
        int[] a = {5,1,2,3,6,4};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,4));//3
        System.out.println(Arrays.binarySearch(a,1,5,4));//3      对查询的东西指定范围(1,5)为范围

        // Arrays.copyOf() 方法： 复制指定的数组，用零截取或填充（如有必要），以便复制具有指定的长度。
        int [] arr5 = {1,9,3,7};
        int [] arr6=Arrays.copyOf(arr5,6);
        System.out.println(Arrays.toString(arr6));//[1, 9, 3, 7, 0, 0]

        //

    }
}
