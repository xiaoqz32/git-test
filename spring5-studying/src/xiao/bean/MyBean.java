package xiao.bean;

import org.springframework.beans.factory.FactoryBean;
import xiao.dao.Course;

/**
 * @author xiaoqz
 * @create 2021-07-27 16:06
 * @description
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("Cname");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
