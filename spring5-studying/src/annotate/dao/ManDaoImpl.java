package annotate.dao;

import org.springframework.stereotype.Component;

/**
 * @author xiaoqz
 * @create 2021-07-28 13:28
 * @description
 */
@Component(value = "man")
public class ManDaoImpl implements ManDao{
    /**
     //AopInvokationException:Null return value from advice does not match primitive return type for
     *这里要把返回值类型改为引用数据类型
     * 查了一下，如果代理的方法返回值类型为void，就return null；否则就return method.invoke(my, args);
     * 也就是说，动态代理在没有返回值的情况下，会返回null值
     * @param a
     * @param b
     * @return
     */

    @Override
    public Integer add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    @Override
    public void study() {
        System.out.println("i like studying");
    }
}
