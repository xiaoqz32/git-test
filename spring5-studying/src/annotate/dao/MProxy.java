package annotate.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author xiaoqz
 * @create 2021-07-28 16:15
 * @description
 */
@Component
@Aspect
@Order(-1)
public class MProxy {

    //方法抽取
    @Pointcut(value = "execution(* annotate.dao.ManDaoImpl.add(..))")
    public void point(){}

    @Before(value = "point()")
    public void before(){
        System.out.println("before...");
    }

    //后置通知  方法返回值之后执行
    @AfterReturning(value = "execution(* annotate.dao.ManDaoImpl.add(..))")
    public void afterReturning(){
        System.out.println("afterReturn...");
    }
    //加入这个后会报aopinvocationexception
    @Around(value = "execution(* annotate.dao.ManDaoImpl.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }
    //after（最终通知）类似于finally
    @After(value = "execution(* annotate.dao.ManDaoImpl.add(..))")
    public void after(){
        System.out.println("after...");
    }

    @AfterThrowing(value = "execution(* annotate.dao.ManDaoImpl.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

}
