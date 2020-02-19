package priv.ze.spring.AOP;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * ClassName:MyAfterReturningAdvice
 * Package:priv.ze.spring.AOP
 *
 * @date:2019/11/29 12:47
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    //  后置通知可以获取到目标方法的返回结果，但无法改变目标方法的结果
    //  参数o为目标方法的返回值
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了后置通知");
        System.out.println("github");
    }
}
