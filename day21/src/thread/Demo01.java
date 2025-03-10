package thread;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.junit.Test;

public class Demo01 {
    public static void main(String[] args) {
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("用户线程在运行...");
                    Thread.sleep(3000);
                    System.out.println("用户线程运行结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
    public static void main2(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread thread = Thread.currentThread();
                    System.out.println(thread.getId()+"开始运行");
                    Thread.sleep(3000);
                    System.out.println(thread.getId()+"结束运行");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    public static void main1(String[] args) {

        new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   Thread thread = Thread.currentThread();
                   System.out.println(thread + "t1..start...");
                   Thread.sleep(1000*3);
                   System.out.println("t1...stop....");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }).start();
    }
}
