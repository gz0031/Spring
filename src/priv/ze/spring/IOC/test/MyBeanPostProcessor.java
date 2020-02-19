package priv.ze.spring.IOC.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName:MyBeanPostProcessor
 * Package:priv.ze.spring.IOC.test
 *
 * @date:2019/11/23 15:35
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
//    bean:表示当前正在进行初始化的Bean对象
//    beanName：表示当前正在进行初始化的Bean对象的id
//    在这两个方法中可以对bean对象做增强并返回，以此得到增强的对象（例如将小写字母全部转换为大写字母）
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在每个bean初始化之前执行");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在每个bean初始化之后执行");
        return bean;
    }
}
