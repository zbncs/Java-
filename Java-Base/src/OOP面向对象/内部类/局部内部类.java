package OOP面向对象.内部类;

public class 局部内部类 {
    public static void main(String[] args) {
        new Outer().method();
    }

    static class Outer {
        int num = 1;
        public void method() {
            final int x = 2; //
            class Innter {
               public void test() {
                   //x = 6;
                   System.out.println(x);
               }

            }
            new Innter().test();
        }

    }
}
