package IO.序列流;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class sequence序列流 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Java-Base/src/IO/demo.txt");
        FileInputStream fis1 = new FileInputStream("Java-Base/src/IO/stream.txt");
        FileInputStream fis2= new FileInputStream("Java-Base/src/IO/buf-demo.txt");

        FileOutputStream fos = new FileOutputStream("Java-Base/src/IO/sequence.txt");

        Vector<FileInputStream> vector = new Vector<>();

        vector.add(fis);
        vector.add(fis1);
        vector.add(fis2);

        Enumeration<FileInputStream> elements = vector.elements();

        SequenceInputStream sis = new SequenceInputStream(elements);

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
