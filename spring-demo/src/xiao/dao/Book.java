package xiao.dao;

/**
 * @author xiaoqz
 * @create 2021-07-25 9:49
 * @description:set方法注入属性
 */
public class Book {
    private String bname;
    private String address;
    private String bauthor;
    private String specail;

    public Book(){}

    public void setBauthor(String bauthor){
        this.bauthor = bauthor;

    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSpecail(String specail){
        this.specail = specail;
    }

    public void testDemo(){
        System.out.println(bname + "::" + bauthor + "::" + address + "::" + specail);
    }
}
