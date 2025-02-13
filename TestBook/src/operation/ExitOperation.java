package operation;

import book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出图书系统");
        //1代表正常退出
        System.exit(1);
    }
}
