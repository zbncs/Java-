package 并发编程.线程的创建方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 3.实现Callable接口，传递给FutureTask类，再将返回的Task任务交给Thread
 * 有返回值。
 */
public class 第三_实现Callable接口配合FutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyThread());

        new Thread(futureTask).start();

        Integer integer = futureTask.get();
        System.out.println(integer);

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + i);
        }
    }

    static class MyThread implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("子线程" + i);
            }
            return sum;
        }
    }
}
