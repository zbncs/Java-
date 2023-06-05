package 文件.File对象;

import java.io.File;

public class File判断 {
    public static void main(String[] args) {
        File file = new File("Java-Base/src/文件/a.txt");

        System.out.println("=============文件是否存在=================");
        System.out.println(file.exists());

        System.out.println("=============是否是文件=================");
        System.out.println(file.isFile());

        System.out.println("=============是否是文件夹=================");
        System.out.println(file.isDirectory());

        System.out.println("=============是否是绝对路径=================");
        System.out.println(file.isAbsolute());

        System.out.println("=============是否是隐藏文件=================");
        System.out.println(file.isHidden());

        System.out.println("=============是否=================");
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        System.out.println(file.canExecute());

    }
}
