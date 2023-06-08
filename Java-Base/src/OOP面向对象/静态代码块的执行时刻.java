package OOP面向对象;

/**
 * 类的 static 代码段，可以看作是类首次加载(被虚拟机加载)执行的代码，而对
 * 于类的加载，首先要执行其基类的构造,再执行其本身的构造；
 */
public class 静态代码块的执行时刻 {
    public static void main(String[] args) {
        B b = new B();
        b = new B();
    }

    static class A {
        static {
            System.out.println("父类中静态代码块");
        }

        public A() {
            System.out.println("父类的构造函数");
        }
    }

    static class B extends A {
        static {
            System.out.println("子类的静态代码块");
        }

        public B() {
            System.out.println("子类的构造函数");
        }
    }
}
