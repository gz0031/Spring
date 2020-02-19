package priv.ze.spring.proxy;

/**
 * ClassName:StaticAgent
 * Package:priv.ze.spring.proxy
 *
 * @date:2019/11/27 16:10
 */
public class StaticProxy implements SomeService{

    private SomeServiceImpl target;

    public StaticProxy() {
    }

    public StaticProxy(SomeServiceImpl target) {
        this.target = target;
    }

    @Override
    public String doFirst() {
        String s=target.doFirst();
        return s.toUpperCase();
    }

    @Override
    public void doSecond() {
        //不需要加强的方法直接调用者目标对象的方法即可
      target.doSecond();
    }
}
