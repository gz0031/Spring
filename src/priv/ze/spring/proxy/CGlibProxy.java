package priv.ze.spring.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ClassName:CGlibProxy
 * Package:priv.ze.spring.proxy
 *
 * @date:2019/11/27 17:17
 */
public class CGlibProxy implements MethodInterceptor {
    private SomeServiceImpl target=new SomeServiceImpl();

    public CGlibProxy(SomeServiceImpl target) {
        this.target = target;
    }

    public SomeServiceImpl myCglibCreator(){
        Enhancer enhancer=new Enhancer();
        //指定父类，即目标类。
        enhancer.setSuperclass(SomeServiceImpl.class);
        //设置回调接口对象
        enhancer.setCallback(this);
        return (SomeServiceImpl) enhancer.create();
    }

    //回调接口方法
    //回调接口的方法执行条件是：代理对象执行目标方法时会触发该方法执行
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
           Object invoke=method.invoke(target,objects);
           if(invoke!=null){
               invoke =((String)invoke).toUpperCase();
           }
           return invoke;
    }
}
