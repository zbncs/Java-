package OOP面向对象.抽象类和接口;

/**
 * 抽象类和接口区别
 *
 *      抽象类的成员变量可以是其他类型，接口的成员变量修饰符是public static final
 *      抽象方法可以有自己的实现方式，接口中方法只能有定义；
 *      抽象类只能单继承，接口可以多实现
 */
public class 抽象类和接口区别 {
    public static void main(String[] args) {

    }
}
// 不需要，抽象类不一定非要有抽象方法。
abstract class Demo1 {
    private String name;
    public static void run() {
        System.out.println("sdsd");
    }
}

interface De1 {
    //成员变量 final类型
    public String a = "";
    public abstract void run();
}

class A implements De1 {

    @Override
    public void run() {
        // a = "1";
    }
}
