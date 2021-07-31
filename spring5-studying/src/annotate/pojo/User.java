package annotate.pojo;

import org.springframework.stereotype.Component;

/**
 * @author xiaoqz
 * @create 2021-07-27 20:21
 * @description
 */
@Component(value = "user")
public class User {
    private String name;

    public void test(){
        System.out.println(name);
    }
}
