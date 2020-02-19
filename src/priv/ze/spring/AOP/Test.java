package priv.ze.spring.AOP;

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
        SomeService someService= (SomeService) ac.getBean("someService");
        someService.doFirst();
        System.out.println("============");
        someService.doSecond();
        System.out.println("============");
        someService.doThird();

        System.out.println("============");
        SomeService someService1= (SomeService) ac.getBean("someService1");
        someService1.doFirst();
        System.out.println("============");
        someService1.doSecond();
        System.out.println("============");
        someService1.doThird();
    }

}
