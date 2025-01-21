import java.util.*;
public class study03 {
	public static void main(String[]args) {
		int count =3;
		Scanner scan=new Scanner(System.in);
		while(count!=0) {
			System.out.println("请输入你的密码:>");
			String password=scan.nextLine();
			if(password.equals("123456")) {
			System.out.println("密码正确,登录成功");
			break;
			}else {
				count--;
				System.out.println("你还有" + count +"次机会");
			}
		}











	}
	public static void main9(String[]args) {
		for(int n =1;n<=999999;n++) {
			int count = 0;
			int tmp=n;
			//求位数
			while(tmp!=0) {
				count++;
				tmp=tmp/10;
			}
			tmp=n;
			int sum=0;
			while(tmp !=0) {
				sum+=Math.pow(tmp%10,count);
				tmp=tmp/10;
			}
			if(sum==n)
			{
				System.out.println(sum +"is my result");
			}

		}



	}
	public static void main8(String[]args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i/10==9) {
				count++;
			}//十位
			if(i%10==0) {
				count++;
			}//倍数
		}
		System.out.println(count);

	}
	public static void main7(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int flg=1;
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+1.0/i*flg;
			flg=-flg;
		}
		System.out.println(sum);
	}

	public static void main6 (String[]args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		        if(b>a) {
		        	int temp=a;
		        	a=b;
		        	b=temp;
		        }//确保a是最大值
		        int c=a/b;
		        while(a%b!=0) 
		        {
		       	    c=a%b;
		       		a=b;
		       		b=c;
		        }
		        System.out.println(c);
	}

	public static void main5(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int j=2;
		for(int i =0; i<n;i++)
		{
			for( j =2;j<=(int)Math.sqrt(n);j++) {
				if(i%j==0) {
					//System.out.println(n + "不是一个素数!");
					break;
				}
				if(j>(int)Math.sqrt(i)) {
					System.out.println(i+"这是一个素数");
				}
			}
		}

	}




	public static void main4 (String[]args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randNum=random.nextInt(100);//[0-100)
		//System.out.println(randNum);
		while(true) {

			System.out.print("请输入一个数字:>");
			int num=scan.nextInt();
			if(num <randNum) {
			System.out.println("你猜的数字小啦");

			} else if (num >randNum){
				System.out.println("你猜的数字大了");
			}else {
				System.out.println("恭喜你猜对了!!!");
				break;
			}
		}

	}

	public static void main3(String[]args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(scan.hasNextInt()) {
		     num=scan.nextInt();
		}

	}

	public static void main2(String[]args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(num<=100)
		{
			if(num%15==0)
			{
				System.out.println(num);
				break;
			}
			num++;
		}

	}







	public static void main1(String[]args) 
	{
		int sum=0;
		int num=1;
		int temp=1;
		while(num<=5)
		{
			int i=1;
			temp=1;
			while(i<=num)
			{
				temp*=i;
				i++;
			}
			sum+=temp;
			num++;
		}
		System.out.println(sum);
	}
}