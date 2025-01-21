import java.util.Scanner;

public class study {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt()) {
				int year=scan.nextInt();
			if(year%4==0&&year%100!=0||year%400==0) {
				System.out.println("这一年是闰年");
			}else {
				System.out.println("这一年不是闰年");
                }
		}
		
	}









	public static void main3(String[]args) {
		double d=10.5;//10.5默认就是双精度
		System.out.println(d);
		System.out.println(Double.MIN_VALUE);
	}

	//运用时命令行参数
	public static void main2 (String[] args) {
		for(int i= 0; i<args.length; i++) {
			System.out.println(args[i]);;
		}
			System.out.println("hehe");

	}

	public static void main1(String[] args) {
		//66666
		long a=40L;
		System.out.println(666);
		System.out.println("最大值" + Long.MIN_VALUE);//拼接

	}
}