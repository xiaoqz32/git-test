package xiao.collections;

/**
 * @author xiaoqz
 * @create 2021-07-27 14:10
 * @description
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
