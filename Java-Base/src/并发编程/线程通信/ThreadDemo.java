package 并发编程.线程通信;

public class ThreadDemo {
    public static void main(String[] args) {
        Account account = new Account("1", 0);

        new DrawThread("小明", account).start();
        new DrawThread("小红", account).start();

        new saveMoneyThread("亲爹", account);
        new saveMoneyThread("干爹", account);
        new saveMoneyThread("岳父", account);

    }
}
