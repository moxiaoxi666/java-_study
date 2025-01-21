import java.util.Scanner;
public class TestDemo {
    public static int maxNum(int num1,int num2) {
        return num1>num2?num1:num2;
    }
    public static int maxThreeNum(int num1,int num2,int num3) {
        int max=maxNum(num1,num2);
        //return maxNum(max,num3);
        return maxNum(maxNum(num1,num2),num3);
    }
    public static void main(String[] args) {
        /**
        *psvm
        *sout
        */
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int max=maxThreeNum(num1,num2,num3);
        System.out.println(max);
    }
}
