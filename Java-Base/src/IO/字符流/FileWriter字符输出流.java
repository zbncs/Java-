package IO.字符流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter
 * 若文件不存在，会创建。若存在，会覆盖。
 *
 * FileWriter(filename, append): append为true时是追加操作
 */
public class FileWriter字符输出流 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Java-Base/src/IO/demo.txt");

        /**
         *  write()：写入数据，把数据放入了缓冲区；
         *  flush()：立即将缓冲区中数据写入目标对象
         *  close()：关闭流，关闭之前调用了flush方法
         *
         */
        fw.write("sdsdsd");
        fw.flush();

        // 获取系统的换行符
        final String s = System.getProperty("line.separator");
        fw.write("fff"+s+"ggg");
        fw.flush();


        fw.close();

        testExeption();

    }

    /**
     * 处理异常的基本操作：
     *
     */
    public static void testExeption() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Java-Base/src/IO/demo1.txt");
            fw.write("ssdsd");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 一定要判断不为空
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
