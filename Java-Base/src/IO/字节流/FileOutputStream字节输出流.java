package IO.字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream字节输出流 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Java-Base/src/IO/stream.txt");

        // 直接写入目标文件，不需要flush
        fos.write("sdsduj".getBytes());

        fos.close();
    }
}
