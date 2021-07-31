package xiao.test1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xiao.collections.Books;
import xiao.collections.Stu;

/**
 * @author xiaoqz
 * @create 2021-07-27 10:19
 * @description
 */
public class ColTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("col.xml");
        Stu bean = context.getBean("stu", Stu.class);
        bean.print();
        bean.printcourse();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext col1 = new ClassPathXmlApplicationContext("col1.xml");
        col1.getBean("book", Books.class).print();

    }
}
