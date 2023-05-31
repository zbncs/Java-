package OOP面向对象.抽象类和接口;

/**
 * 成员变量,只能是常量
 * 方法只能是抽象的
 *
 * 不允许出现方法名相同，返回值不同的抽象方法
 *
 * 接口与接口之间是继承关系，可以多继承；
 */
public class 接口 {
    public static void main(String[] args) {
        Cls cls = new Cls();
        cls.test();

        System.out.println("========================");
        ManySome manySome = new ManySome();
        manySome.test1();
    }

    interface Demo {
        final String NAME = "zs";
        abstract void test();
    }

    interface Demo1 {
        abstract void test1();
        final String FA = "1";
    }

    interface Demo2 {
        abstract void test1();
        final String FA = "1";
    }

    // 非抽象类
    static class Cls implements Demo {
        @Override
        public void test() {
            System.out.println(Demo.NAME+"  " + NAME);
        }
    }

    // 子类是抽象类
    abstract class Child implements Demo {

    }

    // 多实现
    class Many implements Demo,Demo1 {

        @Override
        public void test() {

        }

        @Override
        public void test1() {

        }
    }

    static class ManySome implements Demo1,Demo2 {

        @Override
        public void test1() {
            System.out.println(Demo1.FA);
            System.out.println(Demo2.FA);
        }
    }
}
