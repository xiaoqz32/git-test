package transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import transaction.dao.UserDao;

/**
 * @author xiaoqz
 * @create 2021-07-30 15:51
 * @description
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void addAndReduce(){
        userDao.add();
//        int i = 10/0;
        userDao.reduce();
    }


}
