package xiao.service;

import xiao.daoz.UserDao;

/**
 * @author xiaoqz
 * @create 2021-07-26 17:10
 * @description
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService.put()方法的输出");
        userDao.put();
    }
}
