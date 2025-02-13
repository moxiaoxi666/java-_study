import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TestMain {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name =scanner.nextLine();
        System.out.println(name + "请输入你的身份: 1为管理员,2为普通用户");
        int choice =scanner.nextInt();
        //利用向上转型创建对象种类
        if(choice == 1) {
            return new Admin(name);
        } else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        //1.准备书籍
        BookList bookList = new BookList();
        //2.登录
        User user = login();
        while(true) {
            //利用抽象类实现多态进行打印(运行时绑定)
            //利用choice 找对于方法 work
            int choice = user.menu();
            user.doOperation(bookList, choice);
        }
    }
}
