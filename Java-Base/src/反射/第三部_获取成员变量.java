package 反射;

import 反射.domain.Person;

import java.lang.reflect.Field;

public class 第三部_获取成员变量 {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        //
        Field name = personClass.getDeclaredField("name");
        Person person = personClass.newInstance();

        // 对私有字段取消检查，可以访问
        name.setAccessible(true);

        name.set(person, "32323");

        //
        Object o = name.get(person);
        System.out.println(o);

    }
}
