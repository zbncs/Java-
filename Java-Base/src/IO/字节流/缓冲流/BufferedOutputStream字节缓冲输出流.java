package IO.字节流.缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream字节缓冲输出流 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Java-Base/src/IO/buf-demo.txt", true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("888".getBytes());

        bos.close();
    }
}
