package 反射;

import 反射.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class 反射第一步_获取字节码对象 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        // 1.Class.forName(String className): 全类名
        Class<?> aClass1 = Class.forName("反射.domain.Person");

        // 2.类名.class
        Class<Person> aClass = Person.class;

        // 3.对象.getClass()
        Person person = new Person();
        Class<? extends Person> aClass2 = person.getClass();

    }
}
