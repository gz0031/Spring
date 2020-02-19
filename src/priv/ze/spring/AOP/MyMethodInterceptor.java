package priv.ze.spring.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ClassName:MyMethodInterceptor
 * Package:priv.ze.spring.AOP
 *
 * @date:2019/11/29 12:54
 */
public class MyMethodInterceptor implements MethodInterceptor {
    //环绕通知：可以修改目标方法的返回值
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("执行了环绕通知：目标方法执行之前");
        Object result = methodInvocation.proceed();
        System.out.println("执行了环绕通知，目标方法执行之后");
        return result;
    }
}
