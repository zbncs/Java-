package IO.转换流;

import java.io.*;

public class OutputStreamWriter字节输出流转字符输出流 {
    public static void main(String[] args) throws IOException {
        //wanzhengban();

        //jianhuaban();

        // 写入文件
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Java-Base/src/IO/transform-demo.txt")));
        String s = null;
        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();

            bw.flush();
        }

        br.close();
        bw.close();

    }

    private static void jianhuaban() throws IOException {
        // 简化版
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = null;
        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();

            bw.flush();
        }

        br.close();
        bw.close();
    }

    private static void wanzhengban() throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        PrintStream out = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(out);

        BufferedWriter bw = new BufferedWriter(osw);

        String s = null;

        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
