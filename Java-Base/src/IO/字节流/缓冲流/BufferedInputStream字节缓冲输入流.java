package IO.字节流.缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream字节缓冲输入流 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Java-Base/src/IO/buf-demo.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int len = 0;
        while ((len = bis.read()) != -1) {
            System.out.println((char) len);
        }

        bis.close();
    }
}
