package Base.字符串;

import java.util.Arrays;

public class 常用方法 {
    public static void main(String[] args) {
        String str = "124Afgg89";

        System.out.println(str.length());
        System.out.println("======================================");

        System.out.println(str.indexOf("2"));
        System.out.println(str.indexOf("g", 3));
        System.out.println(str.indexOf(65));

        System.out.println("======================================");

        System.out.println(str.equals("124Afgg89"));
        System.out.println(str.equalsIgnoreCase("124afGG89"));

        String str1 = "";
        String str2 = " ";
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        System.out.println("======================================");

        System.out.println(str.charAt(0));

        System.out.println("======================================");

        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));

        System.out.println("======================================");

        System.out.println(str.startsWith("1"));

        System.out.println("======================================");

        System.out.println(Arrays.toString(str.split("")));

        System.out.println("======================================");

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        System.out.println("======================================");

        System.out.println(Arrays.toString(str.getBytes()));

        System.out.println("======================================");

        System.out.println(str.contains("g"));

        System.out.println("======================================");

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println("======================================");
        System.out.println(str.concat("hsjj"));

        System.out.println("================比较方法======================");
        System.out.println(str.compareTo("224Afgg89"));

    }
}
