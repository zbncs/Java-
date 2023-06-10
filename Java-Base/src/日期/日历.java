package 日期;

import java.util.Calendar;

public class 日历 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(year+"-"+month+"-"+day+" " + hour+":"+minute+":"+second);

        System.out.println("================================");

        int date = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(date);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);

        int i = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(i);
        int week = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println(week);

        // 加
        calendar.add(Calendar.DAY_OF_WEEK, 1);

        // 减
        calendar.add(Calendar.HOUR, -1);

        System.out.println(calendar.get(Calendar.MONTH));


    }
}
