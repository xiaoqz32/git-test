package transaction.test;

import com.alibaba.druid.sql.builder.UpdateBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transaction.config.Config;
import transaction.service.UserService;

/**
 * @author xiaoqz
 * @create 2021-07-30 15:57
 * @description
 */
public class Test {

    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.addAndReduce();
    }

    @org.junit.Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transaction1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.addAndReduce();

    }

    @org.junit.Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addAndReduce();
    }
}
