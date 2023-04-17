package 内部类;

public class TestDemo {
    public static void main(String[] args) {
        // 成员内部类
        内部类分类.InnerClass innerClass = new 内部类分类().new InnerClass();
        innerClass.inner();

        // 静态内部类
        内部类分类.StaticClass staticClass = new 内部类分类.StaticClass();
        staticClass.staticMethod();

        // 局部内部类
        new 内部类分类().test().run();

        // 匿名内部类
        new InnerName() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }.run();
    }
}
