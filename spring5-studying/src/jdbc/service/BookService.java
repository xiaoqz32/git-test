package jdbc.service;

import jdbc.dao.BookDao;
import jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaoqz
 * @create 2021-07-29 15:12
 * @description
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    public int add(Book book){
        return bookDao.add(book);
    }

    public int delete(String name){
        return bookDao.delete(name);
    }

    public int modify( Book book,String name){
        return bookDao.modify(book,name);
    }

    public int count(){
        return bookDao.count();
    }

    public Book query(String author){
        return bookDao.query(author);
    }

    public List<Book> queryAll(){
        return bookDao.queryAll();
    }

    public void addBatch(List<Object[]> batches){
        bookDao.addBatch(batches);
    }
}
