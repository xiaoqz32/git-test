package annotate.dao;

import org.springframework.stereotype.Component;

/**
 * @author xiaoqz
 * @create 2021-07-27 23:03
 * @description
 */
@Component
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl.add()");
    }
}
