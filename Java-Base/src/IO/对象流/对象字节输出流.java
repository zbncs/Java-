package IO.对象流;

import java.io.*;

public class 对象字节输出流 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Java-Base/src/IO/Object.object"));
        oos.writeObject(new Person("zh", 18));
        oos.close();
    }

    static class Person implements Serializable {
//        @Serial
//        private static final long serialVersionUID = 1111L;

        private String name;
        private Integer age;
        // -------transient 和 static 修饰的都不会被序列化---------
        private transient String gender;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
