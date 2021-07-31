package annotate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xiaoqz
 * @create 2021-07-27 23:10
 * @description 扫描配置文件，代替xml
 * <context:component-scan base-package="annotate"></context:component-scan>
 * <aop:aspectj-autoproxy proxy-target-class="true"></aop:aspectj-autoproxy>
 */
@Configuration//作为配置类，代替xml文件
@ComponentScan(basePackages = { "annotate" })
@ComponentScan(basePackages = { "annotate" })
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
