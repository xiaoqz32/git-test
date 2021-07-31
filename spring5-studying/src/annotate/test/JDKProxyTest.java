package annotate.test;

import annotate.dao.ManDao;
import annotate.dao.ManDaoImpl;
import annotate.dao.UserDao;
import annotate.dao.UserDaoImpl;
import org.junit.Test;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaoqz
 * @create 2021-07-28 13:26
 * @description
 */
public class JDKProxyTest {

    public static void main(String[] args) {

        Class[] interfaces = {ManDao.class};
        ManDao manDao = new ManDaoImpl();
        ManDao proxyClass = (ManDao) Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(), interfaces, new ManProxy(manDao));
        int add = proxyClass.add(1, 2);
        System.out.println(add);
    }
}
class ManProxy implements InvocationHandler {
    private Object obj;

    public ManProxy(Object obj){
        this.obj = obj;
    }

    //增加的功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("被增强的方法执行之前" + method.getName());
        //被执行的方法
        Object invoke = method.invoke(obj, args);
        System.out.println("被执行的方法之后");
        return invoke;
    }
}