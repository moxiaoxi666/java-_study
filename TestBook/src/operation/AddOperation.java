package operation;

import book.Book;
import book.BookList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

//新增图书
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //1.得到数据
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入这本书名字");
        String name = scanner.nextLine();
        System.out.println("请输入这本书作者");
        String author = scanner.nextLine();
        System.out.println("请输入这本书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入这本书的类型");
        String type =scanner.next();
        //2.创建存储对象
        Book book = new Book(name,author,price,type);
        //3.尾插
        int curSize = bookList.getUseSize();
        bookList.setBooks(curSize,book);
        bookList.setUseSize(curSize+1);
        System.out.println("新增成功");
    }
}
