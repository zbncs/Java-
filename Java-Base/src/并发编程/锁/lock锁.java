package 并发编程.锁;

import java.util.concurrent.locks.ReentrantLock;

public class lock锁 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
    }
}
