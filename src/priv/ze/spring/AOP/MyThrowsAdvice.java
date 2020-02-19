package priv.ze.spring.AOP;

import org.springframework.aop.ThrowsAdvice;

/**
 * ClassName:MyThrowsAdvice
 * Package:priv.ze.spring.AOP
 *
 * @date:2019/11/29 13:02
 */
public class MyThrowsAdvice implements ThrowsAdvice {
    //当目标方法抛出与指定类型的异常具有ia-a关系的异常时，执行当前方法
    public void afterThrowing(Exception ex){
        System.out.println("执行了异常通知方法");
    }
}
