package 并发编程.线程的创建方式;

/**
 * 线程的驱动方式是调用start方法
 *
 * 1.继承Thread类，重写run方法。
 */
public class 第一_继承Thread {
    public static void main(String[] args) {
        new MyThread().start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程："+i);
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程："+i);
            }
        }
    }
}
