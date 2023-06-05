package 文件.File对象;

import java.io.File;

/**
 * 创建文件对象
 */
public class FileO {
    public static void main(String[] args) {
        // 第一种方式
        //File file = new File("Java-Base/src/文件/a.txt");
        // 第二种方式
        //File file1 = new File("Java-Base/src/文件/", "a.txt");
        // 第三种方式
        File file2 = new File("Java-Base/src/文件/");
        File file3 = new File(file2, "c.txt");

        System.out.println(file3.exists());
        System.out.println(File.separator);
        System.out.println(File.pathSeparatorChar);

    }
}
