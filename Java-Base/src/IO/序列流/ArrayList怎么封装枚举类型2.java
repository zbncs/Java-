package IO.序列流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayList怎么封装枚举类型2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Java-Base/src/IO/demo.txt");
        FileInputStream fis1 = new FileInputStream("Java-Base/src/IO/stream.txt");
        FileInputStream fis2= new FileInputStream("Java-Base/src/IO/buf-demo.txt");

        FileOutputStream fos = new FileOutputStream("Java-Base/src/IO/sequence.txt");

        ArrayList<FileInputStream> streams = new ArrayList<>();

        streams.add(fis);
        streams.add(fis1);
        streams.add(fis2);

        // 利用工具类Collections实现
        Enumeration<FileInputStream> enumeration = Collections.enumeration(streams);


        SequenceInputStream sis = new SequenceInputStream(enumeration);

        BufferedInputStream bis = new BufferedInputStream(sis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int read = 0;
        while ((read = bis.read()) != -1) {
            bos.write(read);
            bos.flush();
        }

        fos.close();
        fis.close();
        fis1.close();
        fis2.close();
        bis.close();
        bos.close();
    }
}
