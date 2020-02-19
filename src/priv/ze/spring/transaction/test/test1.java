package priv.ze.spring.transaction.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.ze.spring.transaction.Exception.BuyStockException;
import priv.ze.spring.transaction.service.IBuyStockService;

/**
 * ClassName:test1
 * Package:priv.ze.spring.transaction.test
 *
 * @date:2019/12/4 14:55
 */
public class test1 {
    private IBuyStockService service;

    @Before
    public void before(){
        String resource ="priv/ze/spring/transaction/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
        service= (IBuyStockService) ac.getBean("BuyService");
    }

    @Test
    public void test01(){
        service.openAccount("高泽",10000);
        service.openStock("西安邮电大学",0);
    }

    @Test
    public void test02() throws BuyStockException {
        service.buyStock("高泽",2000,"西安邮电大学",20);
    }
}
