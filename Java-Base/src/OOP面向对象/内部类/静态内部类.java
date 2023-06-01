package OOP面向对象.内部类;

public class 静态内部类 {
    public static void main(String[] args) {
        Outer.Innter innter = new Outer.Innter();
        //innter.test();

        Outer1.Innter1 innter1 = new Outer1().new Innter1();
        innter1.method1();
    }
    // 可以访问外部类的静态成员，不能访问实例成员
    static class Outer {
        static int y = 1;
        static class Innter {
            public void test() {
                System.out.println("+======="+y);
            }
        }
    }

    /**
     * 在早期的jdk版本中，成员内部类中只能定义非静态的属性和方法，除非同时使用final和static进行修饰；
     * 在新版的jdk中，成员内部类中也可以定义静态的属性和方法；
     */

    static class Outer1 {
        public class Innter1 {
            static int x = 1;
            static void method1() {
                System.out.println(x);
            }
        }
    }
}
