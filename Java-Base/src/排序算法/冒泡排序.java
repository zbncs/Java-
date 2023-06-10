package 排序算法;

import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 0, 9};

        bubble(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
