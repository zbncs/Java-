package IO.字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream字节输入流 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Java-Base/src/IO/stream.txt");

        int ind = 0;
        while ((ind = fis.read()) != -1) {
            // int 强转成char
            System.out.println((char) ind);
        }
        fis.close();

        System.out.println("============================");
        testArr();
    }

    public static void testArr() throws IOException {
        FileInputStream fis = new FileInputStream("Java-Base/src/IO/stream.txt");

        byte[] bytes = new byte[3];

        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();

    }
}
