package priv.ze.spring.AspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * ClassName:MyAspect
 * Package:priv.ze.spring.AspectJ
 *
 * @date:2019/11/30 15:53
 */
public class MyAspect {
    //  前置通知
    public void myBefore() {
        System.out.println("执行了前置通知方法");
    }

    public void myBefore1(JoinPoint jp) {
        System.out.println("执行了前置通知方法");
        System.out.println(jp);
    }

    //  后置通知
    public void myAfterReturning() {
        System.out.println("执行了后置通知方法");
    }

    public void myAfterReturning1(Object result) {
        System.out.println("执行了后置通知方法"+result);
    }

    //    环绕通知
    //    此处必须要加参数
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行了环绕通知，在目标方法之前");
        Object result = pjp.proceed();
        System.out.println("执行了环绕通知，在目标方法之后");
        return result;
    }

    //    异常通知
    public void myAfterThrowing() {
        System.out.println("执行了异常通知");
    }

    //    加入参数可以打印异常信息
    public void myAfterThrowing1(Exception e) {
        System.out.println("执行了异常通知,异常为" + e.getMessage());
    }

    //    最终通知
    public void myAfter() {
        System.out.println("执行了最终通知");
    }
}