package 文件.File对象;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class File获取方法 {
    public static void main(String[] args) {
        File file = new File("Java-Base/src/文件/a.txt");
        // 获取文件名
        System.out.println("==============获取文件名=============");
        String name = file.getName();
        System.out.println(name);

        System.out.println("==============获取文件绝对路径=============");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        System.out.println("==============获取文件大小=============");
        long length = file.length();
        System.out.println(length);

        System.out.println("==============获取文件修改时间=============");
        long lastModified = file.lastModified();
        System.out.println(lastModified);

        Date date = new Date(lastModified);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String format = dateTimeInstance.format(date);
        System.out.println(format);


    }
}
