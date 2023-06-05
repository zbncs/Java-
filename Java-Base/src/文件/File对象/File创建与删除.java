package 文件.File对象;

import java.io.File;
import java.io.IOException;

public class File创建与删除 {
    public static void main(String[] args) throws IOException {
        System.out.println("==============创建文件=============");
        /**
         * 如果文件不存在，则创建；
         * 如果文件存在，则不创建；
         *
         * 删除，不会放入回收站
         */
        File file = new File("Java-Base/src/文件/c.txt");
        boolean isHas = file.createNewFile();

        System.out.println(isHas);

        System.out.println("==============删除文件=============");
        boolean isDelete = file.delete();
        System.out.println(isDelete);

        System.out.println("==============创建文件夹=============");
        File file1 = new File("Java-Base/src/文件/ccc");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);

        System.out.println("==============创建多级文件夹=============");
        File file2 = new File("Java-Base/src/文件/bbb/ddd/aaa");
        boolean mkdirs = file2.mkdirs();
        System.out.println(mkdirs);

        System.out.println("==============删除文件夹=============");
        //file1.delete();
        file2.delete();


    }
}
