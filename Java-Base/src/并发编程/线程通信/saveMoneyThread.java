package 并发编程.线程通信;

public class saveMoneyThread extends Thread {
    private Account acc;

    public saveMoneyThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true) {
            acc.saveMoney(100000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
