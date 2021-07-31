package xiao.test1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestConstructor;
import xiao.bean.Emp;
import xiao.dao.Book;
import xiao.dao.Orders;
import xiao.dao.User;
import xiao.daoz.UserDaoImpl;
import xiao.service.UserService;

/**
 * @author xiaoqz
 * @create 2021-07-24 16:55
 * @description
 */
public class FirstDemo {

    @Test
    public void test1(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("dao1.xml");
        //2.获取配置创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

    }

    @Test
    public void bookTest(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dao1.xml");
        //2.获取配置创建对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void ordersTest(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dao1.xml");
        //2.获取配置创建对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.print();
    }

    @Test
    public void serviceTest(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dao1.xml");
        //2.获取配置创建对象  dao.xml文件中 对应的id名，和他所属的类
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void userDaoImplTest(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dao1.xml");
        //2.获取配置创建对象
        UserDaoImpl userService = context.getBean("userDaoImpl", UserDaoImpl.class);
        System.out.println(userService);
        userService.put();
    }

    @Test
    public void beanTest(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取配置创建对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.testO();
    }

    @Test
    public void jiliangFirstTest(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取配置创建对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.testO();
    }

    @Test
    public void jiliangSecondTest(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取配置创建对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.testO();
    }

}
