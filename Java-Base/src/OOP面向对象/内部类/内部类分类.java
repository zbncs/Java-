package OOP面向对象.内部类;

class 内部类分类 {
    public String name = "zs";
    public static int age;

    public static void main(String[] args) {
        // 匿名内部类
        new InnerName() {
            @Override
            public void run() {
                System.out.println("run~~~~");
            }
        }.run();
    }
    // 静态内部类
    static class StaticClass {
        void staticMethod() {
            age = 18;
        }
    }
    // 成员内部类
    class InnerClass {
        public static String a;
        void inner() {
            System.out.println(age);
            System.out.println(name);
        }
    }
    // 局部内部类
    public InnerName test() {
        class MethodInnerClass implements InnerName {
            @Override
            public void run() {

            }
        }
        // 局部内部类只能在所在的方法体作用域内进行实例化，而如果要在所在方法体返回该类，就要通过接口向上转型的操作。
        return new MethodInnerClass();
    }
}

interface InnerName {
    void run();
}
