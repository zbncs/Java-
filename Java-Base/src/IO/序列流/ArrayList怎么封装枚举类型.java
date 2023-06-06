package IO.序列流;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayList怎么封装枚举类型 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Java-Base/src/IO/demo.txt");
        FileInputStream fis1 = new FileInputStream("Java-Base/src/IO/stream.txt");
        FileInputStream fis2= new FileInputStream("Java-Base/src/IO/buf-demo.txt");

        FileOutputStream fos = new FileOutputStream("Java-Base/src/IO/sequence.txt");

        ArrayList<FileInputStream> streams = new ArrayList<>();

        streams.add(fis);
        streams.add(fis1);
        streams.add(fis2);

        // 利用迭代器封装枚举类型;
        // 内部类访问外部变量时，高版本jdk不需要final；
        // 在jdk 7版本中，如果局部变量是在局部内部类中使用，必须显式地加上final关键字；在jdk 8版本中，会默认添加final关键字；
        Iterator<FileInputStream> iterator = streams.iterator();

        Enumeration<FileInputStream> enumeration = new Enumeration<>() {
            @Override
            public boolean hasMoreElements() {
                return iterator.hasNext();
            }

            @Override
            public FileInputStream nextElement() {
                return iterator.next();
            }
        };

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
