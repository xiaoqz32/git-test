package annotate.service;

import annotate.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiaoqz
 * @create 2021-07-27 23:04
 * @description
 * 创建bean实例的四个注解
 * （1）@Component
 * （2）@Service
 * （3）@Controller
 * （4）@Repository
 */
@Service
public class UserService {
    //四种属性注入的注解
//    @Autowired 自动装配
//    @Qualifier(value="userDaoImpl") //通过名字注入，要和@Autowired搭配使用
    @Resource(name = "userDaoImpl")
    private UserDao userDao;
    //普通注入
    @Value(value = "basketball")
    private String hobby;
    public void add(){
        userDao.add();
        System.out.println("UserService.add()" + hobby);
    }
}
