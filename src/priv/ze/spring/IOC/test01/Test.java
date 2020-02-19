package priv.ze.spring.IOC.test01;

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
        String resource= "priv/ze/spring/IOC/test01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        School s= (School) ac.getBean("mySchool");
        //手动关闭容器
        //((AbstractApplicationContext)ac).registerShutdownHook();
        System.out.println(s);
    }
}
