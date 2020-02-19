package priv.ze.spring.AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:Test
 * Package:priv.ze.spring.AspectJ
 *
 * @date:2019/11/30 16:01
 */
public class Test {
    public static void main(String[] args) {
        String resource = "priv/ze/spring/AspectJ/appliciationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        SomeService someService = (SomeService) ac.getBean("someService");
        someService.doFirst();
        System.out.println("==============");
        someService.doSecond();
        System.out.println("==============");
        someService.doThird();
    }
}
