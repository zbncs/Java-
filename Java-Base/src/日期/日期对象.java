package 日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class 日期对象 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());

        System.out.println("============================");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        // 将日期转成格式的字符串
        System.out.println(format);
        // 将字符串转成日期
        Date date1 = simpleDateFormat.parse("2023-06-09 12:00:00");
        System.out.println(date1);

        System.out.println("=====================================");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        String s = timeFormatter.format(now);
        System.out.println(s);
    }
}
