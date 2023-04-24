package Base.字符串;

import java.util.Arrays;

public class 常用方法 {
    public static void main(String[] args) {
        String str = "124Afgg89";
        System.out.println(str.indexOf("2"));
        System.out.println(str.equals("124Afgg89"));
        System.out.println(str.charAt(0));
        System.out.println(Arrays.toString(str.split("")));
        System.out.println(Arrays.toString(str.getBytes()));

    }
}
