package 反射;

import 反射.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 第三部_获取成员方法 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Person> personClass = Person.class;

        //extracted(personClass);

        Method show = personClass.getMethod("show");
        // 方法调用
        show.invoke(personClass.newInstance());

    }

    private static void extracted(Class<Person> personClass) {
        Method[] methods = personClass.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method dm : declaredMethods) {
            System.out.println(dm.getName());
        }
    }
}
