package IO.打印流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class printWriter字符打印流 {
    public static void main(String[] args) throws IOException {
        /**
         * 参数：
         *      1、字符串路径
         *      2、File对象
         *      3、字节输出流
         *      4、字符输出流
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out, true);

        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            printWriter.println(s.toUpperCase());
//            printWriter.flush();
        }

        printWriter.close();
        bufferedReader.close();

    }
}
