package xiao.daoz;

import org.springframework.context.annotation.Bean;

/**
 * @author xiaoqz
 * @create 2021-07-26 17:09
 * @description
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void put() {

        System.out.println("UserDaoImpl.put()方法");
    }
}
