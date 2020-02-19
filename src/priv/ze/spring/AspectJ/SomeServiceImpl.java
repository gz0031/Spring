package priv.ze.spring.AspectJ;

/**
 * ClassName:SomeServiceImpl
 * Package:priv.ze.spring.proxy
 *
 * @date:2019/11/27 16:08
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doFirst() {
        System.out.println("执行了doFirst");
    }

    @Override
    public void doSecond() {
        System.out.println("执行了doSecond");
    }

    @Override
    public void doThird() {
        System.out.println("执行了doThird");
    }
}
