package Base;

/**
 *  Byte,Short,Integer,Long 这 4 种包装类默认创建了数值 [-128，127] 的相应类型的缓存数据
 *
 * Character 创建了数值在 [0,127] 范围的缓存数据
 *
 * Boolean 直接返回 True Or False
 *
 * 两种浮点数类型的包装类 Float,Double 并没有实现常量池技术
 */

public class 包装类型的常量池技术 {

    public static void main(String[] args) {
        Byte a = 127;
        Byte b = 127;
        Integer c = -128;
        Integer d = -128;
        System.out.println(a == b);
        System.out.println(c == d);

        Long l1 = 128L;
        Long l2 = 128L;

        System.out.println(l2 == l1);

        Character ch1 = 128;
        Character ch2 = 128;
        Character ch3 = 127;
        Character ch4 = 127;

        System.out.println(ch1 == ch2);
        System.out.println(ch3 == ch4);

        Boolean bool1 = true;
        Boolean bool2 = true;
        System.out.println(bool1 == bool2);

        Float f1 = 0.8f;
        Float f2 = 0.8f;
        Double dou1 = 8.99;
        Double dou2 = 8.99;
        System.out.println(f1 == f2);
        System.out.println(dou1 == dou2);

    }
}
