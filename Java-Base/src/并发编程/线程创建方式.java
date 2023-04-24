package 并发编程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class 线程创建方式 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1
//        MyThread thread1 = new MyThread();
//        thread1.start();

        // 2.
//        Thread thread = new Thread(new Myhtread1());
//        thread.start();

        // 3
        FutureTask<Integer> task = new FutureTask<>(new MyThread2());
        Thread thread = new Thread(task);
        thread.start();

        Integer o = task.get();
        System.out.println(o);

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + i);
        }

    }
}

// 方式一: 继承Thread，只能继承一个一个类，不能拓展
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程" + i);
        }
    }
}

// 2.实现Runnable，拓展性强，但是线程执行结果没有返回值
class Myhtread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程" + i);
        }
    }
}

class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("子线程" + i);
        }
        return sum;
    }
}


