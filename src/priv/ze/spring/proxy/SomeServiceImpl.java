package priv.ze.spring.proxy;

/**
 * ClassName:SomeServiceImpl
 * Package:priv.ze.spring.proxy
 *
 * @date:2019/11/27 16:08
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public String doFirst() {
        System.out.println("执行了doFirst");
        return "abcde";
    }

    @Override
    public void doSecond() {
        System.out.println("执行了doSecond");
    }
}
