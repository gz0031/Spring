package priv.ze.spring.AOP;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * ClassName:MyMethodBeforeAdvice
 * Package:priv.ze.spring.AOP
 *
 * @date:2019/11/28 22:37
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行了前置通知");
    }
}
