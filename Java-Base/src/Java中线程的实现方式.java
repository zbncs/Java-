import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Java中线程的实现方式 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 三种实现方式：
         *      1.继承Thread类，重写run方法
         *      2.实现Runnable接口，重写run方法
         *      3.实现Callable重写call方法，配合FutureTask
         *      4.基于线程池
         *
         *      以上本质都是实现Runnable接口
         */
        // 1.
        // extendsThread(threadWay);

        // 2.
        // impRunnable();
        // 使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });

        // lambda
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        // 3.
        // callableAndFutureTask();


    }

    private static void callableAndFutureTask() throws InterruptedException, ExecutionException {
        ThreadWay2 threadWay2 = new ThreadWay2();
        FutureTask futureTask = new FutureTask<>(threadWay2);
        Thread thread = new Thread(futureTask);
        thread.start();
        // 做一些操作

        // 结果
        Object o = futureTask.get();
        System.out.println("总和：" + o);
    }

    private static void impRunnable() {
        ThreadWay1 threadWay = new ThreadWay1();
        Thread thread = new Thread(threadWay);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
    }

    private static void extendsThread() {
        ThreadWay threadWay = new ThreadWay();
        threadWay.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
    }
}
// 1
class ThreadWay extends Thread {
    @Override
    public void run() {
        //
        for (int i = 0; i < 10; i++) {
            System.out.println("thread: " + i);
        }
    }
}
// 2
class ThreadWay1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread: " + i);
        }
    }
}

// 3
class ThreadWay2 implements Callable {

    @Override
    public Object call() throws Exception {

        return null;
    }
}
