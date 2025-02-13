package operation;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书");
        for (int i = 0; i < bookList.getUseSize(); i++) {
            //要熟练使用封装性
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
