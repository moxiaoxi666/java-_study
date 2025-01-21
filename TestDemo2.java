public class TestDemo2 {
    public static int add(int a , int b) {
        return a+b;
    }
    public static int add(int a,int b,int c) {
        return a+b+c;
    }
    public static void func1(int n) {
        if(n>9) {
            func1(n/10);
        }
        System.out.println(n%10);
    }
    public static int fun2(int n) {
        if(n==1) return 1;
        else {
            return n+fun2(n-1);
        }
    }
    public static int fun3(int n) {
        if(n>9)
        {
            return n%10+ fun3(n/10);
        }else {
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(fun3(15));
    }
    public static void main3(String[] args) {
        int sum3=fun2(3);
        System.out.println(sum3);
    }

    public static void main2(String[] args) {
        func1(658);
    }
    public static void main1(String[] args) {
        int a =10;
        int b =20;
        int c=40;
        int sum1=add(a,b);
        int sum2=add(a,b,c);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
