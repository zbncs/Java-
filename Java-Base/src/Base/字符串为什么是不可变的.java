package Base;

/**
 * 在Java中，由于会大量的使用String常量，如果每一次声明一个String都创建一个String对象，那将会造成极大的空间资源的浪费。
 *
 * Java提出了String pool的概念，在堆中开辟一块存储空间String pool，当初始化一个String变量时，
 * 如果该字符串已经存在了，就不会去创建一个新的字符串变量，而是会返回已经存在了的字符串的引用。
 */
public class 字符串为什么是不可变的 {

}

class test {
    // 不可变的String
    public static String appendStr(String s) {
        s += "bbb";
        return s;
    }

    // 可变的StringBuilder
    public static StringBuilder appendSb(StringBuilder sb) {
        return sb.append("bbb");
    }

    public static void main(String[] args) {
        String s = new String("aaa");
        String ns = test.appendStr(s);
        System.out.println("String aaa>>>" + s.toString());
        // StringBuilder做参数
        StringBuilder sb = new StringBuilder("aaa");
        StringBuilder nsb = test.appendSb(sb);
        System.out.println("StringBuilder aaa >>>" + sb.toString());
    }
}
