package annotate.dao;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author xiaoqz
 * @create 2021-07-28 20:23
 * @description
 */
@Component
@Aspect
//order：多个增强类对同一个方法进行增强时使用，
//若另一个不使用order时，则使用order的先运行，若都使用则数字越小的先运行,可以是负数
@Order(1)
public class MProxy1 {

    @Before(value = "execution(* annotate.dao.ManDaoImpl.add(..))")
    public void afterReturning(){
        System.out.println("MProxy...");
    }

}
