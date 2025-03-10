package thread;

public class Demo04 {
    static int count = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("李白正在加载游戏");
                    System.out.println("李白加载完毕");
                    count++;
                    synchronized (Demo04.class) {
                        if(count<3) {
                            Demo04.class.wait();
                        } else {
                            Demo04.class.notifyAll();
                        }
                        System.out.println("李白进入游戏");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start(); new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("安琪拉正在加载游戏");
                    System.out.println("安琪拉加载完毕");
                    count++;
                    synchronized (Demo04.class) {
                        if(count<3) {
                            Demo04.class.wait();
                        } else {
                            Demo04.class.notifyAll();
                        }
                        System.out.println("安琪拉进入游戏");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start(); new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("花木兰正在加载游戏");
                    System.out.println("花木兰加载完毕");
                    count++;
                    synchronized (Demo04.class) {
                        if(count<3) {
                            Demo04.class.wait();
                        } else {
                            Demo04.class.notifyAll();
                        }
                        System.out.println("花木兰进入游戏");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
