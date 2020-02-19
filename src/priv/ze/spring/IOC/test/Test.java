package priv.ze.spring.IOC.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:Test
 * Package:priv.ze.spring.IOC.test
 *
 * @date:2019/11/23 12:16
 */
public class Test {
    public static void main(String[] args){
//      创建容器对象，加载Spring配置文件
        String resource= "priv/ze/spring/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        test01 s= (test01) ac.getBean("serviceProxy");
        s.dowork();
    }
}
