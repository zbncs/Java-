package Base.字符串;

/**
 * 第一，使用双引号声明的字符串对象会保存在字符串常量池中。
 * 第二，使用 new 关键字创建的字符串对象会先从字符串常量池中找，如果没找到就创建一个，然后再在堆中创建字符串对象；如果找到了，就直接在堆中创建字符串对象。
 * 第三，针对没有使用双引号声明的字符串对象来说，就像下面代码中的 s1 那样：
 *      String s1 = new String("二哥") + new String("三妹");
 *
 * 由于字符串常量池放在了堆中，执行 String.intern() 方法的时候，如果对象在堆中已经创建了，字符串常量池中就不需要再创建新的对象了，而是直接保存堆中对象的引用
 */
public class intern方法 {
    public static void main(String[] args) {
        String str1 = "111";
        String str2 = str1.intern();

        System.out.println(str1 == str2);

        String str3 = new String("222"); // 指向堆中的对象
        String str4 = str3.intern(); // 指向常量池的对象

        System.out.println(str3 == str4);

        String str5 = new String("333") + new String("555");
        String str6 = str5.intern(); // 字符串常量池中就不需要再创建新的对象了，而是直接保存堆中对象的引用

        System.out.println(str5 == str6);
    }
}
