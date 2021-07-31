package xiao.collections;

import java.util.List;

/**
 * @author xiaoqz
 * @create 2021-07-27 14:43
 * @description
 */
public class Books {
    private List<String> bname;

    public void setBname(List<String> bname) {
        this.bname = bname;
    }

    public void print(){
        System.out.println(bname);
    }
}
