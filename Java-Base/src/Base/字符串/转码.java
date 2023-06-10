package Base.字符串;

import java.io.UnsupportedEncodingException;

/**
 * 编码转换，怎样实现将GB2312编码的字符串转换为ISO-8859-1编码的字符
 */
public class 转码 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        String s1 = new String(s.getBytes("gb2312"), "iso-8859-1");
        System.out.println(s1);

        byte[] bytes = s.getBytes("iso-8859-1");
        String s2 = new String(bytes);
        System.out.println(s2);
    }
}
