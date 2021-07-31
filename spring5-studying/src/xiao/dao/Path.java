package xiao.dao;

/**
 * @author xiaoqz
 * @create 2021-07-27 16:36
 * @description
 */
public class Path {
    private String hello;

    public Path() {
        System.out.println("第一步，调用无参构造器");
    }

    public void setHello(String hello) {
        System.out.println("第二步，调用set方法给属性赋值");
        this.hello = hello;
    }

    public void initMethod(){
        System.out.println("第三步，执行初始化的方法");
    }

    public void destoryMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
