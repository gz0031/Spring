package priv.ze.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:DynamicProxy
 * Package:priv.ze.spring.proxy
 *
 * @date:2019/11/27 16:23
 */
public class JDKProxy {
    public static void main(String[] args) {
        SomeService target=new SomeServiceImpl();
        SomeService service= (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//目标类的类加载器
                target.getClass().getInterfaces(),//目标类所实现的所有接口
                new InvocationHandler() {//匿名内部类
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result=method.invoke(target,args);
                        if (result!=null){
                            result =((String)result).toUpperCase();
                        }
                        return result;
                    }
                }
        );
        String s= service.doFirst();
        System.out.println(s);
        service.doSecond();
    }
}
