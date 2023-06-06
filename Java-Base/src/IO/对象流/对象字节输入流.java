package IO.对象流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 对象字节输入流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Java-Base/src/IO/Object.object"));

        对象字节输出流.Person o = (对象字节输出流.Person) ois.readObject();

        System.out.println(o.getName());
    }
}
