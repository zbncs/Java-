package OOP面向对象;

/**
 * super 和 this
 *
 * 如果子类没有显示指定 super() 方法，那么它也会生成一个隐藏的 super() 方法（无参构造）；
 * 如果显示使用 super() 方法，那么 super() 方法必须放在构造方法的首行，否则编译器会报错；
 *
 * this() 方法来调用本类中的构造方法
 * this 是用来访问本类实例属性和方法的，它会先从本类中找，如果本类中找不到则在父类中找。
 *
 */
public class this测试 {
    public static void main(String[] args) {
        Child child = new Child();
//        child.test();
        child.fn();
    }

    static class Parent {
        public int a = 1;
        Parent() {
            System.out.println("Parent constructor");
        }
        public void test() {
            System.out.println("parent methods");
        }
    }

    static class Child extends Parent {
        public String b = "aaa";

        public void fn() {
            System.out.println(this.a);
            System.out.println(this.b);
            System.out.println(super.a);
            this.test();
            super.test();
        }
    }
}
