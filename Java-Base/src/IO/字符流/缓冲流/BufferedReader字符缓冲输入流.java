package IO.字符流.缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * readLine()：一次读取一行
 */
public class BufferedReader字符缓冲输入流 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Java-Base/src/IO/buf-demo.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }
}
