package 并发编程;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java中线程的状态 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
    }
}
