package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    //name,operation在其他的包中也需要使用
    protected String name;
    //功能实现数组
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    //重点理解
    public void doOperation(BookList bookList,int choice) {
        this.operations[choice].work(bookList);
    }
}
