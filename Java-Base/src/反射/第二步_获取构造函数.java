package 反射;

import 反射.domain.Person;

import java.lang.reflect.Constructor;

/**
 * 带有Declared的都是获取包括静态私有修饰在内的所有的。
 *
 */
public class 第二步_获取构造函数 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        // 无参构造函数
        Constructor<Person> constructor1 = personClass.getConstructor();
        constructor1.newInstance();

        // 有参构造
        Constructor<Person> constructor = personClass.getConstructor(String.class, Integer.class);
        constructor.newInstance("", 18);

        Constructor<?>[] constructors = personClass.getConstructors();

        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor();

        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
    }
}
