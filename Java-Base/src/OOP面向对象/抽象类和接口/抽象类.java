package OOP面向对象.抽象类和接口;

/**
 * 1、抽象类不能被实例化。
 * 2、抽象类应该至少有一个抽象方法，否则它没有任何意义。
 * 3、抽象类中的抽象方法没有方法体。
 * 4、抽象类的子类必须给出父类中的抽象方法全部都得实现，除非该子类也是抽象类。
 *
 *
 * 抽象类不能使用哪些关键字
 *      private：abstract 是为了用来让子类继承的，子类不能继承父类 private 方法
 *      static：static 是属于类的，在类加载时同时被加载了，被类的所有实例共享，而且一定存在具体的实现。但是抽象类不能创建类的实例，抽象方法也没有方法体，这两个关键字本身就存在矛盾。
 *     final：final 的目的是防止属性和方法被修改，不能被继承，但是抽象方法就是用来被继承的。
 *     synchronize：一种线程锁，需要具体操作才能进行同步，但是 abstract 修饰的方法没有方法体，也就没有具体的实现操作。
 */
public class 抽象类 {
    public static void main(String[] args) {

    }
}

abstract class Demo {
    abstract void test();
    private String name;
    private Integer age;
    //private abstract String gender;
    //final abstract String l = "11";
    // static abstract Integer type;
    public Demo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
