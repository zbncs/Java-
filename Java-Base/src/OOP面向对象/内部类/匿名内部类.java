package OOP面向对象.内部类;

/**
 * 匿名内部类必须继承或者实现一个外部类后者接口
 *
 */
public class 匿名内部类 {
    public static void main(String[] args) {
        new Outer().method();
    }

    interface Demo {
        abstract void test();
    }

    static class Outer {
        public void method() {
            new Demo(){
                @Override
                public void test() {
                    System.out.println("匿名内部类");
                }
            }.test();
        }
    }
}
