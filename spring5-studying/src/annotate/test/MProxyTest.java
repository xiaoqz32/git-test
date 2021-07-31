package annotate.test;

import annotate.config.SpringConfig;
import annotate.dao.MProxy;
import annotate.dao.ManDaoImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaoqz
 * @create 2021-07-28 16:25
 * @description
 */
public class MProxyTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mproxy.xml");
        ManDaoImpl manDaoImpl = context.getBean("man", ManDaoImpl.class);
        manDaoImpl.add(1,2);
    }

    //使用完全注解的方式运行
    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ManDaoImpl man = context.getBean("man", ManDaoImpl.class);
        man.add(2,2);
    }
}
