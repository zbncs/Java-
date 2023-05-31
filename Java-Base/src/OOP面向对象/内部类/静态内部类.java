package OOP面向对象.内部类;

public class 静态内部类 {
    public static void main(String[] args) {
        Outer.Innter innter = new Outer.Innter();
        innter.test();
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
}
