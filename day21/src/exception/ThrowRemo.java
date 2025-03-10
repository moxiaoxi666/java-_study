package exception;

public class ThrowRemo {
    public static void main(String[] args) {
        int n = Integer.parseInt("s1000");
        System.out.println(n);
    }
    static void doCompute01(int a , double b) {
        if(b==0) {
            //抛出参数无效的异常,抛给用户
            throw new IllegalArgumentException("除数不能为零");
        }
        double result = a/b;
        System.out.println(result);
    }
    static void doComputer02(int a , double b) {
        try {
            double result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("被除数不能为零");
            throw e;//抛给调用者
        }
        System.out.println("我在这里");
    }
    public static void main1(String[] args) {
        //doCompute01(10,0);
        doComputer02(10,0);
    }
}
