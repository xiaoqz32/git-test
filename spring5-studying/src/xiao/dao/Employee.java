package xiao.dao;

/**
 * @author xiaoqz
 * @create 2021-07-27 18:14
 * @description
 */
public class Employee {
    private Department dept;

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void print(){
        System.out.println(dept);
    }
}
