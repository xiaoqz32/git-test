package xiao.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xiao.dao.Path;

/**
 * @author xiaoqz
 * @create 2021-07-27 16:41
 * @description
 */
public class PathTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("path.xml");
        Path path = context.getBean("path", Path.class);
        System.out.println("第四步，获取创建bean实例");
        context.close();

    }
}
