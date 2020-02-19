package priv.ze.spring.proxy;

/**
 * ClassName:testStatic
 * Package:priv.ze.spring.proxy
 *
 * @date:2019/11/27 16:15
 */
public class testStatic {
    public static void main(String[] args) {
        SomeService target=new SomeServiceImpl();
        SomeService someService=new StaticProxy((SomeServiceImpl) target);
        String s=someService.doFirst();
        System.out.println(s);
        someService.doSecond();
    }
}


