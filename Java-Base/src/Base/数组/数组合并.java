package Base.数组;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class 数组合并 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int[] arr1 = {2, 4, 7};

        concat1(arr, arr1);

        // copy0f()
        concat2(arr, arr1);

        //
        concat3(arr, arr1);
    }

    private static void concat3(int[] arr, int[] arr1) {
        int[] newArr = new int[arr.length+ arr1.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            newArr[i+ arr.length] = arr1[i];
        }

        System.out.println(Arrays.toString(newArr));
    }

    private static void concat2(int[] arr, int[] arr1) {
        /**
         * System.arraycopy:
         *      Object src,  //源数组
         *      int srcPos,  //源数组的起始位置
         *     Object dest, //目标数组
         *     int destPos, //目标数组的起始位置
         *    int length   //复制长度
         *
         *    第一个参数是要被复制的数组
         *    第二个参数是被复制的数字开始复制的下标
         *    第三个参数是目标数组，也就是要把数据放进来的数组
         *    第四个参数是从目标数据第几个下标开始放入数据
         *    第五个参数表示从被复制的数组中拿几个数值放到目标数组中
         */
        int[] of = Arrays.copyOf(arr, arr.length + arr1.length);
        System.arraycopy(arr1, 0, of, arr.length, arr1.length);
        System.out.println(Arrays.toString(of));
    }

    private static void concat1(int[] arr, int[] arr1) {
        int[] all = ArrayUtils.addAll(arr, arr1);
        System.out.println(Arrays.toString(all));
    }
}
