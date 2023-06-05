package 文件.File对象;

import java.io.File;

public class File重命名 {
    public static void main(String[] args) {
        //rename();

        // 实现剪切
        File file1 = new File("Java-Base/src/文件/aaa/cc.txt");
        File file = new File("Java-Base/src/文件/abc.txt");

        boolean b = file.renameTo(file1);
        System.out.println(b);
    }

    private static void rename() {
        File file1 = new File("Java-Base/src/文件/abc.txt");
        File file = new File("Java-Base/src/文件/b.txt");

        boolean b = file.renameTo(file1);
        System.out.println(b);
    }
}
