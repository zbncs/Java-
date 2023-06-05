package 文件.File对象;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 获取目录下文件和文件夹的名称，包括隐藏文件
 */
public class File获取目录下的文件和目录 {
    public static void main(String[] args) {
        File file = new File("Java-Base/src/文件");
        //extracted(file);

        //listFilterDemo(file);

        //listFilesDemo(file);

        // listFilesFilter
        //listFilesFilterDemo(file);

        extracted1(file, ".java");


    }

    private static void extracted1(File file, String endName) {
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(endName);
            }
        });

        for (File f : files) {
            System.out.println(f.getName());
        }
    }

    private static void listFilesFilterDemo(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        });

        for (File f : files) {
            System.out.println(f.getName());
        }
    }

    private static void listFilesDemo(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }

        }
    }

    private static void listFilterDemo(File file) {
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.equals("aaa");
            }
        });

        System.out.println(list.length);

        for (String f : list) {
            System.out.println(f);
        }
    }

    private static void extracted(File file) {
        String[] list = file.list();
        for (String f : list) {
            System.out.println(f);
        }
    }
}
