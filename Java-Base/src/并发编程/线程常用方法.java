package 并发编程;

public class 线程常用方法 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("1线程");
        thread.start();

        MyThread thread1 = new MyThread();
        thread1.setName("2线程");
        thread1.start();

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+""+i);
        }

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread()+":"+i);
            }
        }
    }
}
