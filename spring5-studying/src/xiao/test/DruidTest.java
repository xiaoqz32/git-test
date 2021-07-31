package xiao.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author xiaoqz
 * @create 2021-07-27 19:08
 * @description
 */
public class DruidTest {

    @Test
    public void test1() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        DruidDataSource druid = context.getBean("druid", DruidDataSource.class);
        DruidPooledConnection connection = druid.getConnection();
        System.out.println(connection);
    }

    @Test
    public void test2() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        DruidDataSource druid = context.getBean("dataSource", DruidDataSource.class);
        DruidPooledConnection connection = druid.getConnection();
        System.out.println(connection);
    }
}
