package java虚拟机;

import java.util.Objects;

/**
 * java虚拟机有哪些内存空间
 *      1.栈内存：方法运行时所进入的内存，里面还会存储程序的局部变量
 *      2.堆内存：new出来的数据都会进入堆内存
 *      3.方法区：字节码文件加载时所进入的内存
 */
public class java虚拟机的内存模型 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 20);

        s1.show();
        s2.show();
    }
}

class Student {
    private String name;
    private int age;
    private static String school = "清华大学";

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {
        System.out.println(name + "---" + age + "---" + school);
    }
}
