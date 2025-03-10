package thread;

public class MyThread01 extends Thread{
    public String name;
    public MyThread01(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while(true) {
            System.out.println(666);
        }
    }
}
