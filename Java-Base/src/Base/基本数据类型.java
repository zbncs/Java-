package Base;

/**
 * 数字类型：
 * byte（1字节）、short（2字节）、int（4字节）、long（8字节）默认值：0
 * float（4字节）、double（8字节）默认值：0.0
 * 字符类型：char（2字节）默认值：char数据类型的默认值为'\u0000'(或0)，最大值为'\uffff'(或65,535 )。
 * 布尔类型：boolean（在《Java虚拟机规范》给出了单个boolean占4个字节，和boolean数组1个字节的定义，
 *      具体 还要看虚拟机实现是否按照规范来，所以1个字节、4个字节都是有可能的）默认值：false
 */

public class 基本数据类型 {
    public static byte aByte;
    public static short aShort;
    public static int anInt;
    public static long aLong;

    public static float aFloat;
    public static double aDouble;

    public static char aChar;
    public static boolean aBoolean;

    public static void main(String[] args) {
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt);
        System.out.println(aLong);

        System.out.println(aFloat);
        System.out.println(aDouble);

        System.out.println(aChar == 0);
        System.out.println(aChar == '\u0000');
        System.out.println(aBoolean);
    }
}
