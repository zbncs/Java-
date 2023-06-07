package 并发编程.线程的创建方式;

/**
 * 2.实现Runnable接口，重写run方法；
 *
 * 调用方式：作为new Thread参数传递（也可以使用匿名内部类或者lambda表达式）
 */
public class 第二_实现Runnable接口 {
    public static void main(String[] args) {
        //
        // new Thread(new MyThread()).start();

        // 匿名内部类方式
        /*new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();*/

        // lambda表达式
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程："+i);
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程："+i);
        }
    }

    static class MyThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程："+i);
            }
        }
    }
}
