package jdbc.dao;

import jdbc.entity.Book;

import java.util.List;

/**
 * @author xiaoqz
 * @create 2021-07-29 15:10
 * @description
 */
public interface BookDao {

    public int add(Book book);

    public int delete(String name);


    public int modify(Book book, String name);

    public Book query(String author );

    int count();

    List<Book> queryAll();

    void addBatch(List<Object[]> batches);
}
