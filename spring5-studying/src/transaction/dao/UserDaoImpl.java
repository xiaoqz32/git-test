package transaction.dao;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author xiaoqz
 * @create 2021-07-30 15:50
 * @description
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add() {
        String sql = "update acount set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"hu");
    }

    @Override
    public void reduce() {
        String sql = "update acount set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"yang");
    }
}
