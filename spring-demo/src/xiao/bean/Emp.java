package xiao.bean;

/**
 * @author xiaoqz
 * @create 2021-07-27 8:46
 * @description
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void testO(){
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
