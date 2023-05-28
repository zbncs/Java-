package Base;

public class 在函数中定义的变量不能与其所在函数的形参同名 {
    public static void main(String[] args) {

    }
    public static void fn(int a) {
        // String a = "";

        class A {
            private int a;

        }
    }
}
