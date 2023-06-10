package 设计模式;

/**
 * 单例模式：
 *      1.构造函数私有化
 *      2.在该类内部产生一个唯一的实例对象，并将其封装成为private static类型的成员变量
 *      3.定义一个静态方法返回这个对象
 */
public class 单例模式 {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton singleton1 = new Singleton();

        System.out.println(singleton.getInstance());
        System.out.println(singleton1.getInstance());

        Singleton1 singleton11 = new Singleton1();
        Singleton1 singleton12 = new Singleton1();

        System.out.println(singleton11.getInstance());
        System.out.println(singleton12.getInstance());
    }

    // 饿汉模式
    static class Singleton {
        private Singleton() {}
        private static final Singleton instance = new Singleton();
        public static Singleton getInstance() {
            return instance;
        }
    }

    // 懒汉模式
    static class Singleton1 {
        private Singleton1() {}
        private static Singleton1 instance;
        private static synchronized Singleton1 getInstance() {
            if (instance == null) {
                instance = new Singleton1();
            }
            return instance;
        }
    }
}
