package IO.字符流.缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter(Writer w)
 */
public class BufferedWriter字符缓冲输出流 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Java-Base/src/IO/buf-demo.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("sdsd");
        bw.newLine();

        bw.write("hhhhhh");

        bw.flush();

        // 缓冲区关闭其实等于fw.close();
        bw.close();
    }

}
