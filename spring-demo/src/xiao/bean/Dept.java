package xiao.bean;

/**
 * @author xiaoqz
 * @create 2021-07-27 8:46
 * @description
 */
public class Dept {
    private String dname;
//
//    public String getDname() {
//        return dname;
//    }

    public void setDname(String dname) {
        this.dname = dname;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
