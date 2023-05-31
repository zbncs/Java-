package OOP面向对象.内部类;

public class 作用越范围 {
    public static void main(String[] args) {
        Outer.Innter innter = new Outer().new Innter();
        innter.test();
    }

    static class Outer {
        int num = 1;
        class Innter {
            int num = 2;
            public void test() {
                int num = 3;
                System.out.println(num);
                System.out.println(this.num);
                System.out.println(Innter.this.num);
                System.out.println(Outer.this.num);
            }
        }
    }

}
