package thread;
class Bank{
    private int count = 20000;
    public synchronized boolean getMoney(int money) {
        if(money <= this.count) {
            count -= money;
            System.out.println("成功进行取钱,余额还剩下" + count);
            return true;
        }
        System.out.println("余额不足");
        return false;
    }
}
public class Demo02 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("小明在取钱");
                synchronized (Bank.class) {
                    bank.getMoney(20000);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("老王在取钱");
                synchronized (Bank.class) {
                    bank.getMoney(20000);
                }
            }
        }).start();
    }
}
