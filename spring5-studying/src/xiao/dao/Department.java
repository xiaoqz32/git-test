package xiao.dao;

/**
 * @author xiaoqz
 * @create 2021-07-27 18:13
 * @description
 */
public class Department {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
