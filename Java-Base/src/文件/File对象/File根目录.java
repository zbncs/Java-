package 文件.File对象;

import java.io.File;

public class File根目录 {
    public static void main(String[] args) {
        File[] files = File.listRoots();
        // mac只有一个盘
        System.out.println(files.length);
        for (File f : files) {
            System.out.println(f.getFreeSpace());
            System.out.println(f.getUsableSpace());
            System.out.println(f.getTotalSpace());
        }
    }
}
