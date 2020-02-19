package priv.ze.spring.proxy;

/**
 * ClassName:testCGlib
 * Package:priv.ze.spring.proxy
 *
 * @date:2019/11/27 17:25
 */
public class testCGlib {
    public static void main(String[] args) {
        SomeServiceImpl target=new SomeServiceImpl();
        SomeServiceImpl someService=new CGlibProxy(target).myCglibCreator();
        String s=someService.doFirst();
        System.out.println(s);
        someService.doSecond();
    }
}
