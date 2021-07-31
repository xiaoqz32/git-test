package annotate.test;

import annotate.config.SpringConfig;
import annotate.pojo.User;
import annotate.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

/**
 * @author xiaoqz
 * @create 2021-07-27 20:36
 * @description
 */
public class UserTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("note.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.test();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("note.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.test();
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
        StringBuffer stringBuffer = new StringBuffer();
    }
}
