package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo03 {
    private static String name = "小明";
    private static String gender  = "男";
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    synchronized (Demo03.class) {
                        if("小明".equalsIgnoreCase(name)){
                            name ="小花";
                            gender = "女";
                        }else {
                            name ="小明";
                            gender = "男";
                        }
                        System.out.println(name+"#"+gender);
                        Demo03.class.notify();
                        try {
                            Demo03.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Demo03.class) {
                    while(true) {
                        if("小花".equalsIgnoreCase(name)) {
                            name = "小明";
                            gender = "男";
                        }else {
                            name = "小花";
                            gender = "女";
                        }
                        System.out.println(name+"#"+gender);
                        Demo03.class.notify();
                        try {
                            Demo03.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
    public static void main1(String[] args) throws InterruptedException {
        List<String> ls = new ArrayList<>();
        List<String> list = Collections.synchronizedList(ls);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    list.add("i");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    list.add("666");
                }
            }
        }).start();
        Thread.sleep(5000);
        int len = list.size();
        System.out.println(len);
    }
}
