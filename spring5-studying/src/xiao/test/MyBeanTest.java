package xiao.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xiao.bean.MyBean;
import xiao.dao.Book;
import xiao.dao.Course;
import xiao.dao.Employee;

import java.sql.SQLOutput;

/**
 * @author xiaoqz
 * @create 2021-07-27 16:13
 * @description
 */
public class MyBeanTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Course course = context.getBean("mybean", Course.class);
        Course course1 = context.getBean("mybean", Course.class);
        System.out.println(course);//都是新new的所以对象不一样
        System.out.println(course1);

        //地址一样，创建的是同一个对象
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);//xiao.dao.Book@6b8ca3c8
        System.out.println(book2);//xiao.dao.Book@6b8ca3c8
        /**
         * 在xml设置scope="prototype之后，即为多实例对象，两个地址不一样
         *
         */
    }


    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Employee emp = context.getBean("emp", Employee.class);
        emp.print();
    }
}
