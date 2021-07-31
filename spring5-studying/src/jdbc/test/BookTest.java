package jdbc.test;

import jdbc.entity.Book;
import jdbc.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoqz
 * @create 2021-07-29 15:39
 * @description
 */
public class BookTest {

    @Test
    public void testAdd(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book( "钢铁是怎样练成的", "阿洛夫斯基");
        bookService.add(book);
    }

    @Test
    public void testDelete(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book( "钢铁是怎样练成的", "阿洛夫斯基");
        bookService.delete("hh");
    }

    @Test
    public void testModify(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book( "xiao", "阿洛夫斯基");
        bookService.modify(book,"钢铁是怎样练成的");
    }

    @Test
    public void testCount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book( "xiao", "阿洛夫斯基");
        int count = bookService.count();
        System.out.println(count);
    }

    @Test
    public void testQuery(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book query = bookService.query("阿洛夫斯基");
        System.out.println(query);
    }

    @Test
    public void testQueryAll(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> query = bookService.queryAll();
        System.out.println(query);
    }


    @Test
    public void testAddBatch(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Object[] o1 = {"三国演义","罗"};
        Object[] o2 = {"红楼梦","施"};
        Object[] o3 = {"西游记","罗"};
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
        bookService.addBatch(objects);
    }

}
