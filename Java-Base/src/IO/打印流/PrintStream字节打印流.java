package IO.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream字节打印流 {
    public static void main(String[] args) throws FileNotFoundException {

        /**
         * 参数：
         *      1、字符串路径
         *      2、File对象
         *      3、字节输出流
         *
         *      不抛异常
         */
        PrintStream printStream = new PrintStream("Java-Base/src/IO/print.txt");

        // Write方法只打印数值二进制的低八位数据
        printStream.write(97);
        printStream.write(610);

        // 原数据打印，将数值变成了字符串
        printStream.print(97);

        printStream.close();
    }
}
