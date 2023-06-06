package 文件.File对象.练习;

import java.io.File;

public class 深度遍历文件 {
    public static void main(String[] args) {
        File file = new File("Java-Base/src/文件");

        listAll(file);
    }

    private static void listAll(File file) {
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                listAll(f);
            } else {
                System.out.println(f.getPath());
            }
        }
    }
}
