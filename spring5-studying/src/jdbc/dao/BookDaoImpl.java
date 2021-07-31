package jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import jdbc.entity.Book;

import java.util.List;

/**
 * @author xiaoqz
 * @create 2021-07-29 15:10
 * @description
 */
@Repository
public class BookDaoImpl implements BookDao{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Book book) {

        String sql = "insert into book(`name`,`author`) values(?,?)";
        int update = jdbcTemplate.update(sql, book.getName(),book.getAuthor());
        return update;

    }

    @Override
    public int delete(String name) {
        String sql = "delete from book where name = ?";
        return jdbcTemplate.update(sql,name);
    }


    @Override//public int modify(Book book, String name);
    public int modify(Book book, String name) {
        String sql = "update book set `name`=?,`author`=? where name = ?";
        return jdbcTemplate.update(sql,book.getName(),book.getAuthor(),name) ;
    }

    @Override
    public Book query(String author) {
        String sql = "select * from book where author = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),author);
    }

    @Override
    public int count() {
        //RowMapper 是接口，针对返回不同类型数据，使用这个接口里面实现类完成数据封装
        String sql = "select count(*) from book";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    @Override
    public List<Book> queryAll() {
        String sql = "select * from book";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
    }

    @Override
    public void addBatch(List<Object[]> batches) {
        String sql = "insert into book(`name`,`author`) values(?,?)";
        jdbcTemplate.batchUpdate(sql,batches);
    }
}
