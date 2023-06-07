package 并发编程.线程通信;

public class Account {
    private String cardId;
    private double money;
    public Account() {}

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money >= money) {
                this.money -= money;
                System.out.println(name+"取走了"+money+"还有"+this.money);

                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();

                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void saveMoney(double money) {
        String name = Thread.currentThread().getName();
        try {
            if (this.money == 0) {
                this.money += money;
                System.out.println(name+"存了了"+money+"还有"+this.money);
                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();

                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
