package IO.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader字符输入流 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Java-Base/src/IO/demo.txt");

        /**
         * read()：读取一个字符。
         */
        int index;
        while ((index = fr.read()) != -1) {
            System.out.println(index);
        }
        fr.close();

        testRead();

    }

    /**
     * 使用 read(char[)) 将读取到的字符放入数组中
     * @throws IOException
     */
    public static void testRead() throws IOException {
        FileReader fr = new FileReader("Java-Base/src/IO/demo.txt");

        char[] chars = new char[3];
        int len = 0; // 一次读几个

        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        fr.close();
    }
}
