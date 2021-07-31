package xiao.dao;

/**
 * @author xiaoqz
 * @create 2021-07-25 10:12
 * @description
 */
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void print(){
        System.out.println(oname + "::" + address);
    }
}
