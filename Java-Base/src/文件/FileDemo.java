package 文件;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("Java-Base/src/文件/a.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println("===========================");
        Path path = Path.of("Java-Base/src/文件/a.txt");
        System.out.println(path);
        System.out.println(Files.exists(path));
        // 如果文件存在，会报错
        Files.createFile(Path.of("Java-Base/src/文件/b.txt"));
        Files.createDirectory(Path.of("Java-Base/src/文件/aaa"));
        // .....
    }
}
